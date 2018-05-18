package com.seamount.spring.dao;

import java.util.List;

public interface TblLeaveApplyProcessDao {

	TblLeaveApplyProcessBean queryforBusinessId(String businessId);
	
	void insert(TblLeaveApplyProcessBean bean);
	
	void update(TblLeaveApplyProcessBean bean);
	
	List<String> queryCurrentProcessMobiles(String roleId);
}
