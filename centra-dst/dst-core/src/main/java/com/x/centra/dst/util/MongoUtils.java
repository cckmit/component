package com.x.centra.dst.util;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.x.centra.dst.constants.DiscountConstants;
import com.x.sdk.dss.DSSClientFactory;
import com.x.sdk.dss.interfaces.IDSSClient;

/**
 * mongo
 * @author Easy
 *
 */
public class MongoUtils {
	
	private static final IDSSClient client = DSSClientFactory.getDSSClient(DiscountConstants.DSS_PATH);
	
	private static final String DEFAULT_CHARSET = "utf-8";
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String str0 = "0";
		String str1 = "1";
		String str2 = "2";
		list.add(str0);
		list.add(str1);
		list.add(str2);
		System.out.println(saveAndFlush(list, "5a7a9129fa87ed1cacc7020f||5a7a9184fa87ed1cacc70211"));
	}
	
	/**
	 * 存List返竖线分隔mkey
	 * @author Easy
	 * @param list
	 * @param mkey
	 * @return
	 */
	public static String saveAndFlush(List<String> list, String mkey) {
		String[] keys;
		if(StringUtils.isNoneBlank(mkey)) {
			keys = mkey.split("\\|");			
		}else {
			keys = new String[list.size()];
		}

		String newkeys = "";
		for (int i = 0; i < list.size(); i++) {
			String img = list.get(i);
			if(StringUtils.isNotBlank(img)) {// 有图片
				if(i<keys.length && StringUtils.isBlank(keys[i]) || i>=keys.length) {// 有对应mkey值
					if(StringUtils.isBlank(newkeys)) {// 首图
						newkeys += save(img);					
					} else { //非首图
						newkeys += "|" + save(img);
					}
				}else {
					if(StringUtils.isBlank(newkeys)) {
						newkeys += update(keys[i], img);					
					} else {
						newkeys += "|" + update(keys[i], img);
					}						
				}
			}else {
				if(StringUtils.isBlank(newkeys)) {
					newkeys += "";					
				} else {
					newkeys += "|";
				}
			}
		}
		return newkeys;
	}
	/**
	 * 存list返回竖线分隔ID
	 * @author Easy
	 * @param list
	 * @return
	 */
	public static String save(List<String> list) {
		try {
			String mkey = "";
			for (String str : list) {
				if(StringUtils.isBlank(mkey)) {
					mkey += save(str);
				} else {
					mkey += "|" + save(str);
				}
			}
			return mkey;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * String存mongo
	 * 
	 * @author Easy
	 * @param str
	 * @return
	 */
	public static String save(String str) {
		try {
			return client.save(str.getBytes(DEFAULT_CHARSET), null);			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * String存mongo 加备注
	 * @author Easy
	 * @param str
	 * @param remark
	 * @return
	 */
	public static String save(String str, String remark) {
		try {
			return client.save(str.getBytes(DEFAULT_CHARSET), remark);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 按Key取值
	 * @author Easy
	 * @param mkey
	 * @return
	 */
	public static String find(String mkey) {
		try {
			return new String(client.read(mkey), DEFAULT_CHARSET);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 批量取
	 * @author Easy
	 * @param mkey
	 * @return
	 */
	public static List<String> find(String[] mkey) {
		List<String> result = new ArrayList<>();
		for (String string : mkey) {
			result.add(find(string));
		}
		return result;
	}

	/**
	 * mongo修改
	 * @author Easy
	 * @param mkey
	 * @param str
	 * @return
	 */
	public static String update(String mkey, String str) {
		try {
			return client.update(mkey, str.getBytes(DEFAULT_CHARSET));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
}
