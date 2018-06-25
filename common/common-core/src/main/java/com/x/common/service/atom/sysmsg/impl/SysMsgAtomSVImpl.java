package com.x.common.service.atom.sysmsg.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysmsg.param.SysMsgPageQueryRequest;
import com.x.common.api.sysmsg.param.SysMsgPageVo;
import com.x.common.dao.mapper.attach.MessgeAttachMapper;
import com.x.common.dao.mapper.bo.SysMsg;
import com.x.common.dao.mapper.bo.SysMsgCriteria;
import com.x.common.dao.mapper.bo.SysMsgReceiver;
import com.x.common.dao.mapper.bo.SysMsgReceiverCriteria;
import com.x.common.dao.mapper.interfaces.SysMsgMapper;
import com.x.common.dao.mapper.interfaces.SysMsgReceiverMapper;
import com.x.common.service.atom.sysmsg.ISysMsgAtomSV;
import com.x.sdk.component.sequence.util.SeqUtil;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;
@Service
public class SysMsgAtomSVImpl implements ISysMsgAtomSV {
	@Autowired
	private SysMsgMapper sysMsgMapper;
	@Autowired
	private SysMsgReceiverMapper sysMsgReceiverMapper;
	@Autowired
	private MessgeAttachMapper messageAttachMapper;
	@Override
	public PageInfo<SysMsgPageVo> querySysMsgPage(SysMsgPageQueryRequest request) {
		List<SysMsgPageVo> list = new ArrayList<SysMsgPageVo>();
		SysMsgCriteria sysMsgCriteria = new SysMsgCriteria();
		SysMsgCriteria.Criteria criteria = sysMsgCriteria.createCriteria();
		
		if (!StringUtil.isBlank(request.getTitle())) {
			criteria.andTitleLike("%" +request.getTitle().trim() + "%");
		}
		if (!StringUtil.isBlank(request.getCreatPeople())) {
			criteria.andCreatPeopleLike("%" +request.getCreatPeople().trim() + "%");
		}
		if (!StringUtil.isBlank(request.getState())) {
			criteria.andStateEqualTo(request.getState());
		}
		if (!StringUtil.isBlank(request.getId())) {
			criteria.andIdEqualTo(request.getId());
		}
		if (null != request.getTimeBegin() && null != request.getTimeEnd()) {
			criteria.andSendTimeBetween(request.getTimeBegin(), request.getTimeEnd());
		}
		if(!StringUtil.isBlank(request.getType())){
			criteria.andTypeEqualTo(request.getType());
		}
		if(!CollectionUtil.isEmpty(request.getStates())) {
			criteria.andStateIn(request.getStates());
		}
		sysMsgCriteria.setOrderByClause("creat_Time desc");
		PageInfo<SysMsgPageVo> pageInfo = new PageInfo<SysMsgPageVo>();
		pageInfo.setCount(sysMsgMapper.countByExample(sysMsgCriteria));
		
		if (request.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 15 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(request.getPageInfo().getPageNo());
			pageInfo.setPageSize(request.getPageInfo().getPageSize() == null ? 15
					: request.getPageInfo().getPageSize());
			sysMsgCriteria.setLimitStart(request.getPageInfo().getStartRowIndex());
			sysMsgCriteria.setLimitEnd(request.getPageInfo().getPageSize());
		}
		List<SysMsg> listPage = sysMsgMapper.selectByExampleWithBLOBs(sysMsgCriteria);

		if (!CollectionUtil.isEmpty(listPage)) {
			for (int i = 0; i < listPage.size(); i++) {
				SysMsgPageVo sysMsgPageVo = new SysMsgPageVo();
				BeanUtils.copyProperties(sysMsgPageVo, listPage.get(i));
				SysMsgReceiverCriteria sysMsgReceiverCriteria = new SysMsgReceiverCriteria();
				SysMsgReceiverCriteria.Criteria example = sysMsgReceiverCriteria.createCriteria();
				example.andMsgIdEqualTo(sysMsgPageVo.getId());
				List<SysMsgReceiver> sysMsgReceiver = sysMsgReceiverMapper.selectByExample(sysMsgReceiverCriteria);
				String userIds = "";
				String sysMsgReceiverIds = "";
				for (SysMsgReceiver temp :sysMsgReceiver ) {
					userIds +=temp.getUserId()+";";
					sysMsgReceiverIds+=temp.getId()+";";
				}
				sysMsgPageVo.setUserId(userIds);
				sysMsgPageVo.setSysMsgReceiverId(sysMsgReceiverIds);
				list.add(sysMsgPageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(list);
		return pageInfo;
	}

	@Override
	public Integer deleteSysMsg(String Id) {
		SysMsgCriteria example = new SysMsgCriteria();
		example.createCriteria().andIdEqualTo(Id);
		return sysMsgMapper.deleteByExample(example);
	}

	@Override
	public Integer updateSysMsg(SysMsg sysMsg) {
		SysMsgCriteria example = new SysMsgCriteria();
		example.createCriteria().andIdEqualTo(sysMsg.getId());
		return sysMsgMapper.updateByExampleSelective(sysMsg, example);
	}

	@Override
	public String saveSysMsg(SysMsg sysMsg) {
		String id = SeqUtil.getNewId("SYS$SYSMSG$ID", 8).toString();
		sysMsg.setId(id);
		sysMsgMapper.insertSelective(sysMsg);
		return id;
	}

	@Override
	public SysMsg selectByPrimaryKey(String Id) {
		
		return sysMsgMapper.selectByPrimaryKey(Id);
	}

	@Override
	public PageInfo<SysMsgPageVo> queryMessagePageList(
			SysMsgPageQueryRequest request) {
		PageInfo<SysMsgPageVo> pageInfo = new PageInfo<SysMsgPageVo>();
		//先查出全用户信息
		List<SysMsgPageVo> allUserMessage = messageAttachMapper.getAllUserMessageList();
		//查出非全用户信息
		List<String> notAllUserMsgId = messageAttachMapper.getNotAllUserMessageId();
		//根据非全用户信息及用户id查出该用户收到的非全用户信息
		request.setMsgIdList(notAllUserMsgId);
		List<SysMsgPageVo> notAllUserMsg = messageAttachMapper.getNotAllUserMessageList(request);
		//合并
		allUserMessage.addAll(notAllUserMsg);
		pageInfo.setCount(allUserMessage.size() + notAllUserMsg.size());
		pageInfo.setPageNo(null == request.getPageInfo() ? 1 : request.getPageInfo().getPageNo());
		pageInfo.setPageSize(null == request.getPageInfo() ? 10 : request.getPageInfo().getPageSize());
		
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(allUserMessage);
		return pageInfo;
	}

}
