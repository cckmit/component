package com.x.centra.dst.service.atom.interfaces;

import java.util.List;

import com.x.centra.dst.dao.mapper.bo.DstDiscountInfo;
import com.x.centra.dst.dao.mapper.bo.DstDiscountInfoCriteria;

/**
 * 
 * @author wangluyang
 *
 */
public interface IDstDiscountInfoAtomSV {

	public int insert(DstDiscountInfo record);
	
	public int countByExample(DstDiscountInfoCriteria example);
	
	public int countByDiscountCode(String tenantId, String discountCode);
	
	public int updateByExample(DstDiscountInfo record, DstDiscountInfoCriteria example);
	
	public int updateByExampleSelective(DstDiscountInfo record, DstDiscountInfoCriteria example);
	
	public DstDiscountInfo getByDiscountId(String tenantId, String discountId);
	
	public DstDiscountInfo getByDiscountCode(String tenantId, String discountCode);
	
	public List<DstDiscountInfo> getByDiscountCodes(String tenantId, List<String> discountCode);
	
	public int updateByPrimaryKey(DstDiscountInfo record);
	
	public List<DstDiscountInfo> selectByExample(DstDiscountInfoCriteria example);
	
	public int deleteByExample(DstDiscountInfoCriteria example);
}
