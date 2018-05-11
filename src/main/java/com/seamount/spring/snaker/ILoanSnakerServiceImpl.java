package com.seamount.spring.snaker;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snaker.engine.entity.WorkItem;
import org.springframework.beans.factory.annotation.Autowired;

import com.seamount.spring.service.PlatformJkLoanApplyService;

public class ILoanSnakerServiceImpl implements ILoanSnakerService{
	
	private final Logger log = LoggerFactory.getLogger(ILoanSnakerServiceImpl.class);

	@Autowired
	private SnakerEngineFacets snakerEngineFacets;
	
	@Autowired
	private PlatformJkLoanApplyService platformJkLoanApplyService;
	
	@Override
	public void StartProcess(String applyNo, String employeeId, Map<String, Object> map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RunProcess(String taskId, String applyNo, String employeeId, String roleName, Map<String, Object> map,
			boolean approve, String nodeName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeProcee(String applyNo, String employeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<WorkItem> queryProcessList(String employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
