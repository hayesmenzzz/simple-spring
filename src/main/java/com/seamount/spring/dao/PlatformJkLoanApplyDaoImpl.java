/**
 * Project Name:yahao-p2p
 * File Name:PlatformJkLoanApplyDaoImpl.java
 * Package Name:com.midai.dao.impl
 * Date:2018年3月16日下午5:07:19
 *
*/

package com.seamount.spring.dao;

import java.sql.Types;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

/**
 * ClassName:PlatformJkLoanApplyDaoImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年3月16日 下午5:07:19 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
public class PlatformJkLoanApplyDaoImpl extends BaseDao  implements PlatformJkLoanApplyDao {

	@Override
	public PlatformJkLoanApplyBean queryForApplyNo(String applyNo) {

		String sql = " select id, apply_no,task_id, process_order_id, run_state, role_name, operate_user,  DATE_FORMAT(create_time,'%Y-%m-%d %H:%i:%S') as create_time from tbl_platform_jk_loan_apply  "
				+ " where apply_no = '"+applyNo+"'; ";
		
		return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(PlatformJkLoanApplyBean.class));
		
	}

	@Override
	public void insertOrUpdatePlatformJkLoanApply(
			PlatformJkLoanApplyBean platformJkLoanApplyBean) {

		if(platformJkLoanApplyBean.getId() > 0){ //修改
			
			String update_sql = "update tbl_platform_jk_loan_apply set run_state=?, task_id = ?,role_name = ?,operate_user = ?,process_order_id = ? where apply_no=?";
			jdbcTemplate.update(update_sql, new Object[]{ platformJkLoanApplyBean.getRunState(), platformJkLoanApplyBean.getTaskId(),
					platformJkLoanApplyBean.getRoleName(),platformJkLoanApplyBean.getOperateUser(),platformJkLoanApplyBean.getProcessOrderId(),platformJkLoanApplyBean.getApplyNo()}, 
					new int[]{ Types.INTEGER, Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,});
			
		}else{ //新增
			String insertSql = " INSERT INTO tbl_platform_jk_loan_apply(apply_no, task_id, process_order_id, run_state, role_name, operate_user, create_time) "
					+ " VALUES(?,?,?,?,?,?,now())";
			jdbcTemplate.update(insertSql, new Object[]{platformJkLoanApplyBean.getApplyNo(), platformJkLoanApplyBean.getTaskId(), platformJkLoanApplyBean.getProcessOrderId(), platformJkLoanApplyBean.getRunState(), platformJkLoanApplyBean.getRoleName(), platformJkLoanApplyBean.getOperateUser()},
					new int[]{Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.INTEGER, Types.VARCHAR, Types.VARCHAR});
			
		}
	}

}

