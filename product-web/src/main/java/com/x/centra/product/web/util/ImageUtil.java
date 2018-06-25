package com.x.centra.product.web.util;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.x.base.exception.SystemException;
import com.x.sdk.component.idps.IDPSClientFactory;
import com.x.sdk.component.idps.IImageClient;
/**
 *圖片工具類 
 *
 */
public class ImageUtil {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ImageUtil.class);
    
	/**
	 * 图片方向
	 */
	private static final int TAG_TYPE_ORIENTATION = 274;

    private ImageUtil() {
	}
	public static String getImage(String vsid,String pictype){
       IImageClient im;
       //应用场景
       String idpsns="slp-mall-web-idps";
       //获取imageClient
       im = IDPSClientFactory.getImageClient(idpsns);
      //获取上传图片的URL
       return im.getImageUrl(vsid, "."+pictype);
   }
   public static String getHotImage(){
       IImageClient im;
       //应用场景
       String idpsns="slp-mall-web-idps";
       //获取imageClient
       im = IDPSClientFactory.getImageClient(idpsns);
      //获取上传图片的URL
       return im.getImageUrl("574558c6d601800009c0b0e5", ".jpg");
       //获取上传图片指定尺寸的URL
      // System.out.println(im.getImageUrl("574514c1d601800009c0b0ba", ".jpg","100x80"));
   }
   public static List<String> getImages(Map<String,String> imgMap){
       IImageClient im;
       //应用场景
       String idpsns="slp-mall-web-idps";
       //获取imageClient
       im = IDPSClientFactory.getImageClient(idpsns);
       List<String> list = new ArrayList<String>();
       //获取上传图片指定尺寸的URL
       for (Map.Entry<String, String> entry : imgMap.entrySet()) {
           String url = im.getImageUrl(entry.getKey(), "."+entry.getValue(),"100x80"); 
           list.add(url);
         }
      /* for(String visIDs:imgList){
           String url = im.getImageUrl(visIDs, ".jpg","100x80"); 
           list.add(url);
       }*/
       return list;
   }
   
    /**
     * 判定图片旋转角度
     * 
     * @param file
     * @return
     * @author mayt
     */
    public static int judgeRotation(MultipartFile file) {
        int degree = 0;
        Metadata metadata = null;
        try {
            metadata = ImageMetadataReader.readMetadata(file.getInputStream());
        } catch (ImageProcessingException | IOException e) {
            throw new SystemException(e);
        }
        String description;
        for (Directory directory : metadata.getDirectories()) {
            description = directory.getDescription(TAG_TYPE_ORIENTATION);
            LOGGER.info("image directory description is {}", description);
            if (null == description) {
                continue;
            }
            if (description.startsWith("Right side")) {// 逆时针旋转90度
                degree = 90;
                break;
            } else if (description.startsWith("Bottom")) {// 旋转180度
                degree = 180;
                break;
            } else if (description.startsWith("Left side")) {// 顺时针旋转90度
                degree = 270;
                break;
            } else if (description.startsWith("Top")) {
                break;
            }
        }
        return degree;
    }

    /**
     * 旋转图片
     * 
     * @param degree
     *            旋转角度
     * @return 
     * @throws Exception
     */
    public static byte[] spin(MultipartFile file, int degree) {
        int swidth = 0; // 旋转后的宽度
        int sheight = 0; // 旋转后的高度
        int x; // 原点横坐标
        int y; // 原点纵坐标

        BufferedImage bi;
        try {
            bi = ImageIO.read(file.getInputStream());
        } catch (IOException e) {
            throw new SystemException(e);
        } // 读取该图片
          // 处理角度--确定旋转弧度
        degree = degree % 360;
        if (degree < 0)
            degree = 360 + degree;// 将角度转换到0-360度之间
        double theta = Math.toRadians(degree);// 将角度转为弧度

        // 确定旋转后的宽和高
        if (degree == 180 || degree == 0 || degree == 360) {
            swidth = bi.getWidth();
            sheight = bi.getHeight();
        } else if (degree == 90 || degree == 270) {
            sheight = bi.getWidth();
            swidth = bi.getHeight();
        } else {
            swidth = (int) (Math
                    .sqrt(bi.getWidth() * bi.getWidth() + bi.getHeight() * bi.getHeight()));
            sheight = (int) (Math
                    .sqrt(bi.getWidth() * bi.getWidth() + bi.getHeight() * bi.getHeight()));
        }

        x = (swidth / 2) - (bi.getWidth() / 2);// 确定原点坐标
        y = (sheight / 2) - (bi.getHeight() / 2);

        BufferedImage spinImage = new BufferedImage(swidth, sheight, bi.getType());
        // 设置图片背景颜色
        Graphics2D gs = (Graphics2D) spinImage.getGraphics();
        gs.setColor(Color.white);
        gs.fillRect(0, 0, swidth, sheight);// 以给定颜色绘制旋转后图片的背景

        AffineTransform at = new AffineTransform();
        at.rotate(theta, swidth / 2, sheight / 2);// 旋转图象
        at.translate(x, y);
        AffineTransformOp op = new AffineTransformOp(at, AffineTransformOp.TYPE_BICUBIC);
        spinImage = op.filter(bi, spinImage);
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        try {
            ImageIO.write(spinImage, getFileExtName(file.getOriginalFilename()), bs);
        } catch (IOException e) {
            throw new SystemException(e);
        }
        return bs.toByteArray();
    }
    
    private static String getFileExtName(String fileName){
        String extName = "";
        if (StringUtils.isNotBlank(fileName)){
            int ind = fileName.lastIndexOf('.');
            extName = fileName.substring(ind +1);
        }
        return extName;
    }
}
