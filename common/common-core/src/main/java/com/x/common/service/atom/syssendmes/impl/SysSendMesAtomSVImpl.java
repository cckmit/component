package com.x.common.service.atom.syssendmes.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.syssendmes.param.DeleteSysSendMes;
import com.x.common.api.syssendmes.param.SaveSysSendMes;
import com.x.common.api.syssendmes.param.SendMesPageQueryRequest;
import com.x.common.api.syssendmes.param.SendMesPageVo;
import com.x.common.api.syssendmes.param.SysMesAddresseeAllResponseInfo;
import com.x.common.api.syssendmes.param.SysMesAddresseeQueryRequest;
import com.x.common.api.syssendmes.param.UpdateSysMesAddresseeState;
import com.x.common.dao.mapper.attach.MesAddresseeInfoServiceAttachMapper;
import com.x.common.dao.mapper.bo.SysMesAddressee;
import com.x.common.dao.mapper.bo.SysMesAddresseeCriteria;
import com.x.common.dao.mapper.bo.SysSendMes;
import com.x.common.dao.mapper.bo.SysSendMesCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysMesAddresseeMapper;
import com.x.common.dao.mapper.interfaces.SysSendMesMapper;
import com.x.common.service.atom.syssendmes.ISysSendMesAtomSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.DateUtil;

/**
 * @author auth
 * @date 2017年6月2日 
 * @version V1.0
 */
@Service
public class SysSendMesAtomSVImpl implements ISysSendMesAtomSV{
	
	@Autowired
	private  transient MesAddresseeInfoServiceAttachMapper mesAddresseeInfoServiceAttachMapper;

	@Override
	public PageInfo<SendMesPageVo> querySendMesPage(SendMesPageQueryRequest param) {
		List<SendMesPageVo> sendMesPageVos = new ArrayList<SendMesPageVo>();
		SysSendMesCriteria sysSendMesCriteria = new SysSendMesCriteria();
		String orderByClause = "CREAT_TIME desc";
		sysSendMesCriteria.setOrderByClause(orderByClause);
		PageInfo<SendMesPageVo> pageInfo = new PageInfo<SendMesPageVo>();
		SysSendMesMapper mapper = MapperFactory.getSysSendMesMapper();
		pageInfo.setCount(mapper.countByExample(sysSendMesCriteria));
		if (param.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(param.getPageInfo().getPageNo());
			pageInfo.setPageSize(param.getPageInfo().getPageSize() == null ? 20
					: param.getPageInfo().getPageSize());
			sysSendMesCriteria.setLimitStart(param.getPageInfo().getStartRowIndex());
			sysSendMesCriteria.setLimitEnd(param.getPageInfo().getPageSize());
		}
		List<SysSendMes> selectByExample = mapper.selectByExampleWithBLOBs(sysSendMesCriteria);
		if (!CollectionUtil.isEmpty(selectByExample)) {
			for (int i = 0; i < selectByExample.size(); i++) {
				SendMesPageVo sendMesPageVo = new SendMesPageVo();
				BeanUtils.copyProperties(sendMesPageVo, selectByExample.get(i));
				sendMesPageVos.add(sendMesPageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(sendMesPageVos);
		return pageInfo;
	}

	@Override
	public Integer doSendMes(SysSendMes sysSendMes) {
		SysSendMesMapper mapper = MapperFactory.getSysSendMesMapper();
		return mapper.insert(sysSendMes);
	}

	@Override
	public Integer deleteSysSendMes(String mesId) {
		SysSendMesMapper mapper = MapperFactory.getSysSendMesMapper();
		return mapper.deleteByPrimaryKey(mesId);
	}

	@Override
	public Integer doMesAddressee(SysMesAddressee sysMesAddressee) {
		SysMesAddresseeMapper mapper = MapperFactory.getSysMesAddresseeMapper();
		sysMesAddressee.setState("0");
		return mapper.insert(sysMesAddressee);
	}

	@Override
	public int getSysMesAddresseeCount(SysMesAddresseeQueryRequest param) {
		return mesAddresseeInfoServiceAttachMapper.getSysMesAddresseeCount(param);

	}

	@Override
	public List<SysMesAddresseeAllResponseInfo> queryMesAddresseeByMesId(SysMesAddresseeQueryRequest param) {
		return mesAddresseeInfoServiceAttachMapper.queryMesAddresseeByMesId(param);

	}

	@Override
	public Integer updateStateSu(UpdateSysMesAddresseeState param) {
		SysMesAddresseeCriteria sysMesAddresseeCriteria = new SysMesAddresseeCriteria();
		SysMesAddresseeCriteria.Criteria criteria = sysMesAddresseeCriteria.createCriteria();
		criteria.andIdEqualTo(param.getId());
		SysMesAddresseeMapper mapper = MapperFactory.getSysMesAddresseeMapper();
		SysMesAddressee sysMesAddressee = new SysMesAddressee();
		sysMesAddressee.setState("1");
		return mapper.updateByExampleSelective(sysMesAddressee, sysMesAddresseeCriteria);
	}
	
	@Override
	public Integer updateStateEr(UpdateSysMesAddresseeState param) {
		SysMesAddresseeCriteria sysMesAddresseeCriteria = new SysMesAddresseeCriteria();
		SysMesAddresseeCriteria.Criteria criteria = sysMesAddresseeCriteria.createCriteria();
		criteria.andIdEqualTo(param.getId());
		SysMesAddresseeMapper mapper = MapperFactory.getSysMesAddresseeMapper();
		SysMesAddressee sysMesAddressee = new SysMesAddressee();
		sysMesAddressee.setState("2");
		return mapper.updateByExampleSelective(sysMesAddressee, sysMesAddresseeCriteria);
	}

	@Override
	public SaveSysSendMes queryTimeById(DeleteSysSendMes param) {
		SaveSysSendMes saveSysSendMes = new SaveSysSendMes();
		SysSendMesMapper mapper = MapperFactory.getSysSendMesMapper();
		SysSendMes selectByPrimaryKey = mapper.selectByPrimaryKey(param.getMesId());
		BeanUtils.copyProperties(saveSysSendMes, selectByPrimaryKey);
		return saveSysSendMes;
	}

	@Override
	public List<SysMesAddressee> queryStateSending() {
		SysMesAddresseeCriteria sysMesAddresseeCriteria = new SysMesAddresseeCriteria();
		SysMesAddresseeCriteria.Criteria criteria = sysMesAddresseeCriteria.createCriteria();
		criteria.andStateEqualTo("0");
		Timestamp sysDate = DateUtil.getSysDate();
        Calendar c = Calendar.getInstance();  
        c.add(Calendar.DATE, - 5);
        Date time = c.getTime();
        Timestamp ts = new Timestamp(time.getTime());
		criteria.andCreatTimeBetween(sysDate, ts);
		SysMesAddresseeMapper mapper = MapperFactory.getSysMesAddresseeMapper();
		List<SysMesAddressee> selectByExample = mapper.selectByExample(sysMesAddresseeCriteria);
		return selectByExample;
	}


}
