package com.seamount.spring.snaker;

import java.util.List;
import java.util.Map;

import org.snaker.engine.entity.WorkItem;

/**
 * 
 * ClassName: ILoanSnakerService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年3月15日 下午5:07:48 <br/>
 *	接口流程操作
 * @author 屈志刚  
 * @version 
 * @since JDK 1.8
 */
public interface ILoanSnakerService {
	
	/**
	 * 
	 * StartProcess:(启动流程). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚  
	 * @param process
	 * @param employeeId
	 * @param map
	 * @since JDK 1.8
	 */
	void StartProcess(String applyNo,  String employeeId, Map<String, Object> map);
	
	
	/**
	 * 
	 * RunProcess:(流程流转). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚  
	 * @param taskId 任务ID
	 * @param employeeId 操作人
	 * @param map 流程变量
	 * @param approve 审核结果  true同意   false驳回
	 * @param nodeName 流程节点名称
	 * @since JDK 1.8
	 */
	void RunProcess(String taskId, String applyNo, String employeeId, String roleName, Map<String, Object> map, boolean approve, String nodeName);


	/**
	 * 
	 * closeProcee:(关闭流程【对应拒绝流程】). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚  
	 * @param orderId
	 * @param employeeId
	 * @since JDK 1.8
	 */
	void closeProcee( String applyNo, String employeeId);
	
	/**
	 * 
	 * queryProcessList:(获取待审任务数). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author 屈志刚  
	 * @param employeeId 
	 * @return
	 * @since JDK 1.8
	 */
	List<WorkItem> queryProcessList(String employeeId);
	
	
	
}
