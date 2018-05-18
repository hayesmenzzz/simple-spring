package com.seamount.spring.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.seamount.spring.dao.PlatformJkLoanApplyBean;
import com.seamount.spring.dao.TblLeaveApplyProcessBean;
import com.seamount.spring.service.snaker.leave.LeaveApplyProcessService;
import com.seamount.spring.service.snaker.leave.LeaveApplyProcessServiceImpl;
import com.seamount.spring.service.snaker.leave.LeaveApproveEnum;
import com.seamount.spring.service.snaker.leave.LeaveSnakerService;
import com.seamount.spring.service.snaker.loan.PlatformJkLoanApplyService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SnakerTest {
	
	@Autowired
	private PlatformJkLoanApplyService platformJkLoanApplyService;
	
	@Autowired
	private LeaveApplyProcessService leaveApplyProcessService;

	@Autowired
	private LeaveSnakerService leaveSnakerService;
	
	
	@Test
	public void daoTest(){
//		PlatformJkLoanApplyBean platformJkLoanApplyBean = platformJkLoanApplyService.queryForApplyNo("CD-180319-0003-C01");
//		System.out.println(platformJkLoanApplyBean.toString());
//		TblLeaveApplyProcessBean queryforBusinessId = leaveApplyProcessService.queryforBusinessId("1");
//		System.out.println(queryforBusinessId.toString());
	}
	
	@Test
	public void snakerStart(){
//		String businessId = "333333333";
//		Map<String, Object> map = new HashMap<>();
		
		//员工employee1发起请假申请  以确定的用户发起申请
//		String applyName = "employee1";
//		leaveSnakerService.startProcess(businessId, applyName, map);
		
		//组长同意申请
//		String operator = "leader1";
//		String taskId = "ed4a42a1963e4d60b3fbba8b32c9d57f";
//		String roleName = "leaderReviewRole";  // 当前操作人拥有的权限
//		map.put("rode", LeaveApproveEnum.getId(3, true).getApproveStr());
//		leaveSnakerService.runProcess(taskId, businessId, operator, roleName, map, true, null);
		
		//经理同意批假申请
//		String operator = "manager1";
//		String taskId = "daf5d6673dd543c6951f06126d6a5a22";
//		String roleName = "managerReviewRole";
//		map.put("rode", LeaveApproveEnum.getId(4, true).getApproveStr());
//		leaveSnakerService.runProcess(taskId, businessId, operator, roleName, map, true, null);
		
		//组长退回
//		String operator = "leader1";
//		String taskId = "be4806876c0247359ed652ba054a2950";
//		String roleName = "leaderReviewRole";
//		map.put("rode", LeaveApproveEnum.getId(3, false).getApproveStr());
//		leaveSnakerService.runProcess(taskId, businessId, operator, roleName, map, true, null);
		
		//经理退回到申请员(按图的连线退回 approval=true)
//		String operator = "manager1";
//		String taskId = "22737a68d3424c3580a08e543e5eca89";
//		String roleName = "managerReviewRole";
//		map.put("rode", LeaveApproveEnum.getId(4, false).getApproveStr());
//		leaveSnakerService.runProcess(taskId, businessId, operator, roleName, map, true, null);

		//申请员重新提交(逐级提交)
//		String operator = "employee1";
//		String taskId = "1cfdec48bf424128b456c07167b43769";
//		String roleName = "leaveApplyRole";
//		leaveSnakerService.runProcess(taskId, businessId, operator, roleName, map, true, null);
		
		//经理退回(退回到上一级)
//		String operator = "manager1";
//		String taskId = "5fedf2a59fba464a9a0c2f17baf537f5";
//		String roleName = "managerReviewRole";
//		leaveSnakerService.runProcess(taskId, businessId, operator, roleName, map, false, null);

		//经理退回到组长的任务,组长再继续退回
//		String operator = "leader1";
//		String taskId = "e75f73d07c344a60a147a729233a4e09";
//		String roleName = "leaderReviewRole";
//		leaveSnakerService.runProcess(taskId, businessId, operator, roleName, map, false, null);

		//处理被退回的第一个任务,正常的第一次提交是伴随着启动实例,直接到组长的task(非正常第一次提交)
//		String operator = "employee1";
//		String taskId = "b5adbf34150a4e16a65309339db81823";
//		String roleName = "employee1";      //  这个 RoleName 才是执行者 当退回的时候 actor存的不是 节点对应的角色assigne 而是发起人 所以此处应该传 employee1
//		leaveSnakerService.runProcess(taskId, businessId, operator, roleName, map, true, null);

		//跳过组长,由经理来审核
//		String operator = "manager1";
//		String taskId = "dc5b8de5d13945f98747b30844405bed";
//		String roleName = "managerReviewRole";
//		map.put("rode", LeaveApproveEnum.getId(4, false).getApproveStr());
//		leaveSnakerService.nodeJump(taskId, businessId, operator, map, roleName, "managerApproval");
		
		//申请员发起一个请假申请 跳过组长审核直接让经理审核(应该不行,我这个流程定义如果不达到组长是得不到taskId的，只能run两步，节点足够应该是可以的)
//		String operator = "manager1";
//		String taskId = "37b7905462aa40c5b96d59802e1621c2";
//		String roleName = "managerReviewRole";
//		map.put("rode", LeaveApproveEnum.getId(4, false).getApproveStr());
//		leaveSnakerService.nodeJump(taskId, businessId, operator, map, roleName, "managerApproval");
		
		
		/** ########################################################################### **/
		
		String businessId = "5555555555555";
		Map<String, Object> map = new HashMap<>();
		
		//以申请的任务节点角色发起请假申请
		String applyName = "leaveApplyRole";
		leaveSnakerService.startProcess(businessId, applyName, map);
		
		//申请员重新提交(逐级提交)
//		String operator = "employee3";
//		String taskId = "e976ffff7ec643b2bce61d14f57f54b1";
//		String roleName = "leaveApplyRole";
//		leaveSnakerService.runProcess(taskId, businessId, operator, roleName, map, true, null);

		
		
		//组长同意申请
		String operator = "leader2";
		String taskId = "0d9c5dc6931b4e88b653e4d34a98eee4";
		String roleName = "leaderReviewRole";  // 当前操作人拥有的权限
		map.put("rode", LeaveApproveEnum.getId(3, true).getApproveStr());
		leaveSnakerService.runProcess(taskId, businessId, operator, roleName, map, true, null);
		
		
		//经理退回(退回到上一级)
//		String operator = "manager1";
//		String taskId = "97cbaf3513d042368557a107ea667f1e";
//		String roleName = "managerReviewRole";
//		leaveSnakerService.runProcess(taskId, businessId, operator, roleName, map, false, null);

		//经理退回到申请员(按图的连线退回 approval=true)
//		String operator = "manager1";
//		String taskId = "778a7eb225674222866298898441ff32";
//		String roleName = "managerReviewRole";
//		map.put("rode", LeaveApproveEnum.getId(4, false).getApproveStr());
//		leaveSnakerService.runProcess(taskId, businessId, operator, roleName, map, true, null);

		
	}
}
