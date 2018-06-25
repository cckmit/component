package com.x.common.service.atom.sysitembank.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.PageInfo;
import com.x.common.api.sysitembank.param.CheckDuad;
import com.x.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.x.common.api.sysitembank.param.ItemBankPageVo;
import com.x.common.dao.mapper.bo.SysItembank;
import com.x.common.dao.mapper.bo.SysItembankCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysItembankMapper;
import com.x.common.service.atom.sysitembank.ISysItemBankAtomSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

/**
 * @author auth
 * @date 
 * @version V1.0
 */
@Service
public class SysItemBankAtomSVImpl implements ISysItemBankAtomSV{


	@Override
	public PageInfo<ItemBankPageVo> queryItemBankPage(ItemBankPageQueryRequest param) throws BusinessException, SystemException{
		List<ItemBankPageVo> itemBankPageVos = new ArrayList<ItemBankPageVo>();
		
		SysItembankCriteria sysItemBankCriteria = new SysItembankCriteria();
		SysItembankCriteria.Criteria criteria = sysItemBankCriteria.createCriteria();
		String orderByClause = "create_time desc";
		sysItemBankCriteria.setOrderByClause(orderByClause);
		if (!StringUtil.isBlank(param.getQname())) {
			criteria.andQnameLike("%" + param.getQname().trim() + "%");
		}
		if (!StringUtil.isBlank(param.getState())) {
			criteria.andStateEqualTo(param.getState());
		}
		if (!StringUtil.isBlank(param.getLangDir())) {
			criteria.andLangDirEqualTo(param.getLangDir());
		}
		if (!StringUtil.isBlank(param.getAditor())) {
			criteria.andAditorLike("%" + param.getAditor().trim() + "%");
		}
		if (!StringUtil.isBlank(param.getQuestionType())) {
			criteria.andQuestionTypeEqualTo(param.getQuestionType());
		}
		criteria.andFlagEqualTo("1");
		PageInfo<ItemBankPageVo> pageInfo = new PageInfo<ItemBankPageVo>();
		SysItembankMapper mapper = MapperFactory.getSysItembankMapper();
		pageInfo.setCount(mapper.countByExample(sysItemBankCriteria));

		if (param.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(param.getPageInfo().getPageNo());
			pageInfo.setPageSize(param.getPageInfo().getPageSize() == null ? 20
					: param.getPageInfo().getPageSize());
			sysItemBankCriteria.setLimitStart(param.getPageInfo().getStartRowIndex());
			sysItemBankCriteria.setLimitEnd(param.getPageInfo().getPageSize());
		}
		List<SysItembank> itembankListPage = mapper.selectByExample(sysItemBankCriteria);

		if (!CollectionUtil.isEmpty(itembankListPage)) {

			for (int i = 0; i < itembankListPage.size(); i++) {
				ItemBankPageVo itemBankPageVo = new ItemBankPageVo();
				BeanUtils.copyProperties(itemBankPageVo, itembankListPage.get(i));
				itemBankPageVos.add(itemBankPageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(itemBankPageVos);
		return pageInfo;
	}

	@Override
	public Integer deleteSysItemBank(String bid) {
		SysItembankCriteria sysItemBankCriteria = new SysItembankCriteria();
		SysItembankCriteria.Criteria criteria = sysItemBankCriteria.createCriteria();
		criteria.andBidEqualTo(bid);
		SysItembankMapper mapper = MapperFactory.getSysItembankMapper();
		SysItembank sysItembank = new SysItembank();
		sysItembank.setFlag("0");
		return mapper.updateByExampleSelective(sysItembank, sysItemBankCriteria);
	}

	@Override
	public Integer saveSysItemBank(SysItembank sysItembank) {
		SysItembankMapper mapper = MapperFactory.getSysItembankMapper();
		sysItembank.setFlag("1");
		int insert = mapper.insert(sysItembank);
		return insert;
	}

	@Override
	public Integer updateSysItemBank(SysItembank sysItembank) {
		SysItembankCriteria sysItemBankCriteria = new SysItembankCriteria();
		SysItembankCriteria.Criteria criteria = sysItemBankCriteria.createCriteria();
		criteria.andBidEqualTo(sysItembank.getBid());
		SysItembankMapper mapper = MapperFactory.getSysItembankMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysItembank, sysItemBankCriteria);
		return updateByPrimaryKey;
	}

	@Override
	public Integer checkDuadCn(CheckDuad param) {
		SysItembankCriteria sysItemBankCriteria = new SysItembankCriteria();
		SysItembankCriteria.Criteria criteria = sysItemBankCriteria.createCriteria();
		if (!StringUtil.isBlank(param.getLangDir())) {
			criteria.andLangDirEqualTo(param.getLangDir());
		}
		SysItembankMapper mapper = MapperFactory.getSysItembankMapper();
		int countByExample = mapper.countByExample(sysItemBankCriteria);
		return countByExample;
	}


}
