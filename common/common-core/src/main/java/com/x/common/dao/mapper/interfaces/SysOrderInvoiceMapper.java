package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysOrderInvoice;
import com.x.common.dao.mapper.bo.SysOrderInvoiceCriteria;

public interface SysOrderInvoiceMapper {
    int countByExample(SysOrderInvoiceCriteria example);

    int deleteByExample(SysOrderInvoiceCriteria example);

    int deleteByPrimaryKey(String invoiceId);

    int insert(SysOrderInvoice record);

    int insertSelective(SysOrderInvoice record);

    List<SysOrderInvoice> selectByExample(SysOrderInvoiceCriteria example);

    SysOrderInvoice selectByPrimaryKey(String invoiceId);

    int updateByExampleSelective(@Param("record") SysOrderInvoice record, @Param("example") SysOrderInvoiceCriteria example);

    int updateByExample(@Param("record") SysOrderInvoice record, @Param("example") SysOrderInvoiceCriteria example);

    int updateByPrimaryKeySelective(SysOrderInvoice record);

    int updateByPrimaryKey(SysOrderInvoice record);
}