package com.x.centra.product.web.controller.home;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.x.base.exception.BusinessException;
import com.x.centra.product.web.constants.SysCommonConstants;
import com.x.centra.product.web.util.ImageUtil;
import com.x.centra.product.web.vo.ImgFileInfoVo;
import com.x.sdk.component.idps.IDPSClientFactory;
import com.x.sdk.component.idps.IImageClient;
import com.x.sdk.component.idps.exception.ImageSizeIllegalException;
import com.x.sdk.dss.DSSClientFactory;
import com.x.sdk.dss.interfaces.IDSSClient;
import com.x.sdk.exception.PaasRuntimeException;
import com.x.sdk.web.model.ResponseData;


@Controller
@RequestMapping("/home")
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	//图片最大体积 3M 单位B
	private static final long MAX_IMG_SIEZ = 3 * 1024 * 1024L;

	@RequestMapping({"","/"})
	public String index(Model uiModel) {
		return "forward:/prodquery/add";
	}

	/**
	 * ckedit上传图片
	 * @param file
	 * @param request
	 * @param ckeditFuncNum
	 * @param ckCsrfToken
     * @return
     */
	@RequestMapping("/ckeditUpImg")
	@ResponseBody
	public String ckEditUploadImg(@RequestParam("upload") MultipartFile file, HttpServletRequest request,
							@RequestParam("CKEditorFuncNum") String ckeditFuncNum, String ckCsrfToken){
		printParams(request);
		StringBuilder strBuffer = new StringBuilder();
		try {
			ImgFileInfoVo imgFileInfoVo = saveImg(file,null,0,0);
			logger.info("\rfileUid: {}\rfileUrl: {}", imgFileInfoVo.getVfsId(), imgFileInfoVo.getImgUrl());
			strBuffer.append("<script type=\"text/javascript\">");
			strBuffer.append("window.parent.CKEDITOR.tools.callFunction("+ckeditFuncNum+",'"+imgFileInfoVo.getImgUrl()+"','')");
			strBuffer.append("</script>");
		} catch (BusinessException|IOException e) {
			logger.error("ckedit upload file faile.", e);
			strBuffer.reverse();
			strBuffer.append("<font color=\"red\" size=\"2\">*上传文件错误</font>");
		}
		return strBuffer.toString();
	}
	
	@RequestMapping(value="/displayPic", method=RequestMethod.GET)
	public void displayPic(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String type = request.getParameter("type"); 
		logger.info("fileUid: {}, fileType: {}", id, type);
        response.setContentType("img/" + type.substring(1));  
        response.setCharacterEncoding("utf-8");  
        IDSSClient idssClient = DSSClientFactory.getDSSClient(SysCommonConstants.ProductImage.IDPSNS);
        byte[] data = idssClient.read(id);
        try {  
            OutputStream outputStream = response.getOutputStream();  
            InputStream in = new ByteArrayInputStream(data);  
              
            int len;  
            byte[]buf = new byte[1024];  
            while((len = in.read(buf, 0, 1024)) != -1){  
                outputStream.write(buf, 0, len);  
            }  
            outputStream.close();  
        } catch (IOException e) {  
            logger.error("获取图片流失败", e);
        }  
	}
	
	/**
	 * 图片上传
     */
	@RequestMapping("/upImg")
	@ResponseBody
	public ResponseData<ImgFileInfoVo> uploadImg(@RequestParam("uploadFile") MultipartFile file, String imgSize) {
		ResponseData<ImgFileInfoVo> responseData = null;
		try {
			//图片不能大于3M
			if (file.getSize() > MAX_IMG_SIEZ) {
				throw new BusinessException("图片大小不能超过3M");
			}
			ImgFileInfoVo imgFileInfoVo = this.saveImg(file, imgSize, 300, 200);
			logger.info("\rfileUid: {}\rfileUrl: {}", imgFileInfoVo.getVfsId(), imgFileInfoVo.getImgUrl());
			responseData = new ResponseData<>(ResponseData.AJAX_STATUS_SUCCESS,"上传成功",imgFileInfoVo);
		} catch (IOException e) {
			logger.error("Add file faile1.",e);
			responseData = new ResponseData<>(ResponseData.AJAX_STATUS_FAILURE,"上传失败:文件获取失败");
		} catch (BusinessException e){
			logger.error("Add file faile2.",e);
			responseData = new ResponseData<>(ResponseData.AJAX_STATUS_FAILURE,"上传失败:"+e.getMessage());
		} catch (ImageSizeIllegalException e){
			logger.error("Add file faile3.",e);
			responseData = new ResponseData<>(ResponseData.AJAX_STATUS_FAILURE,"上传失败:图片的高度或宽度不符合要求");
		}
		return responseData;
	}

	/**
	 * 查询用户 
	 */
//	@RequestMapping("/queryuser")
//	@ResponseBody
//	public ResponseData<PageInfoResponse<UcGroupKeyInfoVo>> queryUserList(
//			Integer pageSize, Integer pageNo, String userType, String userName, HttpSession session){
//		ResponseData<PageInfoResponse<UcGroupKeyInfoVo>> responseData;
//		QueryGroupInfoRequest infoRequest = new QueryGroupInfoRequest();
//		infoRequest.setTenantId(AdminUtil.getTenantId());
//		infoRequest.setPageNo(pageNo);
//		infoRequest.setPageSize(pageSize);
//		infoRequest.setCustName(userName);
//		infoRequest.setUserType(userType);
//		IUcKeyInfoSV ucKeyInfoSV = DubboConsumerFactory.getService(IUcKeyInfoSV.class);
//		PageInfoResponse<UcGroupKeyInfoVo> infoResponse = ucKeyInfoSV.queryGroupInfo(infoRequest);
//		ResponseHeader header = infoResponse.getResponseHeader();
//		//若head不为空,且不是成功标识
//		if (header!=null && !header.isSuccess()){
//			responseData = new ResponseData<PageInfoResponse<UcGroupKeyInfoVo>>(ResponseData.AJAX_STATUS_FAILURE,
//					"查询失败:"+header.getResultMessage());
//		}else {
//			responseData = new ResponseData<PageInfoResponse<UcGroupKeyInfoVo>>(ResponseData.AJAX_STATUS_SUCCESS,
//					"查询成功",infoResponse);
//		}
//		return responseData;
//	}

	/**
	 * 获取文件扩展名
	 * @param fileName 文件名
	 * @return 文件扩展名
     */
	private String getFileExtName(String fileName){
		String extName = "";
		if (StringUtils.isNotBlank(fileName)){
			int ind = fileName.lastIndexOf('.');
			extName = fileName.substring(ind);
		}
		return extName;
	}

	/**
	 * 打印参数
	 * @param request
     */
	private void printParams(HttpServletRequest request){
		Map<String,String[]> paramMap = request.getParameterMap();
		if (paramMap == null) {
			throw new BusinessException("paramMap为空");
		}
		for (Map.Entry<String,String[]> entry:paramMap.entrySet()){
		    if (logger.isDebugEnabled()) {
			    logger.debug("the param: {}", entry.getKey()+ Arrays.toString(entry.getValue()));
		    }
		}
	}

	/**
	 * 保存图片信息
	 * @param file
	 * @param imgSize
	 * @param minHeight 图片最小高度
	 * @param minWidth 图片最小宽度
     */
    private ImgFileInfoVo saveImg(MultipartFile file, String imgSize, int minWidth, int minHeight)
            throws PaasRuntimeException, IOException {
        if (file == null) {
            throw new BusinessException("", "上传文件为空");
        }
        int degree = ImageUtil.judgeRotation(file);
        byte[] bytes;
        if (degree == 0) {
            bytes = file.getBytes();
        } else {
            bytes = ImageUtil.spin(file, degree);
        }
        String fileName = file.getOriginalFilename();
        String fileExt = getFileExtName(fileName);
        IImageClient imageClient = IDPSClientFactory
                .getImageClient(SysCommonConstants.ProductImage.IDPSNS);
        String fileUid = imageClient.upLoadImage(bytes, fileName, minWidth, minHeight);
        String imageUrl;
        if (StringUtils.isNotBlank(imgSize)) {
            imageUrl = imageClient.getImageUrl(fileUid, fileExt, imgSize);
        } else {
            imageUrl = imageClient.getImageUrl(fileUid, fileExt);
        }
        ImgFileInfoVo fileInfoVo = new ImgFileInfoVo();
        fileInfoVo.setVfsId(fileUid);
        fileInfoVo.setImgUrl(imageUrl);
        fileInfoVo.setFileType(fileExt);
        return fileInfoVo;
    }
	
}
