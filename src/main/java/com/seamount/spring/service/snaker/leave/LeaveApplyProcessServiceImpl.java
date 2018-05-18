package com.seamount.spring.service.snaker.leave;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seamount.spring.dao.TblLeaveApplyProcessBean;
import com.seamount.spring.dao.TblLeaveApplyProcessDao;

@Service("leaveApplyProcessServiceImpl")
public class LeaveApplyProcessServiceImpl implements LeaveApplyProcessService {

	@Autowired
	private TblLeaveApplyProcessDao tblLeaveApplyProcessDao;
	
	@Override
	public void insert(TblLeaveApplyProcessBean bean) {
		tblLeaveApplyProcessDao.insert(bean);
	}

	@Override
	public void update(TblLeaveApplyProcessBean bean) {
		tblLeaveApplyProcessDao.update(bean);
	}

	@Override
	public TblLeaveApplyProcessBean queryforBusinessId(String businessId) {
		return tblLeaveApplyProcessDao.queryforBusinessId(businessId);
	}

	@Override
	public List<String> queryCurrentProcessMobiles(String roleId) {
		return tblLeaveApplyProcessDao.queryCurrentProcessMobiles(roleId);
	}

}
