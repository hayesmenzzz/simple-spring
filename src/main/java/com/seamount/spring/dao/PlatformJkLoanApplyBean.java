/**
 * Project Name:yahao-p2p
 * File Name:PlatformJkLoanApplyBean.java
 * Package Name:com.midai.pojo
 * Date:2018年3月16日下午5:01:30
 *
*/

package com.seamount.spring.dao;
/**
 * ClassName:PlatformJkLoanApplyBean <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年3月16日 下午5:01:30 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
public class PlatformJkLoanApplyBean {
	
	private long id;
	private String applyNo;  //'借款编号',
	private String taskId;  //工作流任务编号
	private String processOrderId;  //工作流流程实例ID
	private int runState;  //'流程状态（11:业务员申请，12：风控审核，13：产品审核，14：产品运营，15：流程完毕）',
	private String roleName;  //'对应可以查看的角色',
	private String operateUser;  //'操作人'
	private String createTime;
	private String updateTime;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getApplyNo() {
		return applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getProcessOrderId() {
		return processOrderId;
	}
	public void setProcessOrderId(String processOrderId) {
		this.processOrderId = processOrderId;
	}
	public int getRunState() {
		return runState;
	}
	public void setRunState(int runState) {
		this.runState = runState;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getOperateUser() {
		return operateUser;
	}
	public void setOperateUser(String operateUser) {
		this.operateUser = operateUser;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	public PlatformJkLoanApplyBean(long id, String applyNo, String taskId,
			String processOrderId, int runState, String roleName,
			String operateUser, String createTime, String updateTime) {
		super();
		this.id = id;
		this.applyNo = applyNo;
		this.taskId = taskId;
		this.processOrderId = processOrderId;
		this.runState = runState;
		this.roleName = roleName;
		this.operateUser = operateUser;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public PlatformJkLoanApplyBean() {
		super();
	}
	@Override
	public String toString() {
		return "PlatformJkLoanApplyBean [id=" + id + ", applyNo=" + applyNo
				+ ", taskId=" + taskId + ", processOrderId=" + processOrderId
				+ ", runState=" + runState + ", roleName=" + roleName
				+ ", operateUser=" + operateUser + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
	
	

	
	
	
	
	
	

}

