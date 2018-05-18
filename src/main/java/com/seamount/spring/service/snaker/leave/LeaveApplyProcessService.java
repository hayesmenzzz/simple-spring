package com.seamount.spring.service.snaker.leave;

import java.util.List;

import com.seamount.spring.dao.TblLeaveApplyProcessBean;

public interface LeaveApplyProcessService {

	TblLeaveApplyProcessBean queryforBusinessId(String businessId);
	
	void insert(TblLeaveApplyProcessBean bean);

	void update(TblLeaveApplyProcessBean bean);
	
	List<String> queryCurrentProcessMobiles(String roleId);
}
