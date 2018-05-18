package com.seamount.spring.dao;

import java.sql.Types;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class TblLeaveApplyProcessDaoImpl extends BaseDao implements TblLeaveApplyProcessDao {

	@Override
	public TblLeaveApplyProcessBean queryforBusinessId(String businessId) {
		String sql ="select * from tbl_leave_apply_process where business_id = ?";
		List<TblLeaveApplyProcessBean> query = jdbcTemplate.query(sql, new Object[]{businessId}, new int[]{Types.VARCHAR}, BeanPropertyRowMapper.newInstance(TblLeaveApplyProcessBean.class));
		return query != null && query.size() > 0 ? query.get(0) : null;
	}

	@Override
	public void insert(TblLeaveApplyProcessBean bean) {
		String sql = "insert into tbl_leave_apply_process (process_key,process_order_id,task_id,business_id,role_name,def_key,operator,create_time) values (?,?,?,?,?,?,?,now())";
		jdbcTemplate.update(sql, new Object[]{bean.getProcessKey(),bean.getProcessOrderId(),bean.getTaskId(),bean.getBusinessId(),bean.getRoleName(),bean.getDefKey(),bean.getOperator()},
				new int[]{Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR});
	}

	@Override
	public void update(TblLeaveApplyProcessBean bean) {
		String sql = "update tbl_leave_apply_process set process_key=?,process_order_id=?,task_id=?,role_name=?,def_key=?,operator=? where business_id=?";
		jdbcTemplate.update(sql,new Object[]{bean.getProcessKey(),bean.getProcessOrderId(),bean.getTaskId(),bean.getRoleName(),bean.getDefKey(),bean.getOperator(),bean.getBusinessId()},
				new int[]{Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR});
	}

	@Override
	public List<String> queryCurrentProcessMobiles(String roleId) {
		String sql = "SELECT GROUP_CONCAT(CONCAT('''',user_id,'''')) FROM tbl_system_user_role WHERE role_id = ? ";
		List<String> list = jdbcTemplate.queryForList(sql, new Object[]{roleId},new int[]{Types.VARCHAR}, String.class);
		if(list != null && list.size() > 0){
			String user = list.get(0);
			String sql2 = "SELECT phone FROM tbl_system_user WHERE user_name in ("+user+")";
			List<String> list2 = jdbcTemplate.queryForList(sql2,String.class);
			if(list2 != null && list2.size() > 0){
				return list2;
			}
		}
		return null;
	}

}
