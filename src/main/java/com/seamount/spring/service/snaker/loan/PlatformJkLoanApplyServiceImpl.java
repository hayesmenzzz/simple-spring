/**
 * Project Name:yahao-p2p
 * File Name:PlatformJkLoanApplyServiceImpl.java
 * Package Name:com.midai.service.impl
 * Date:2018年3月16日下午5:23:23
 *
*/

package com.seamount.spring.service.snaker.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seamount.spring.dao.PlatformJkLoanApplyBean;
import com.seamount.spring.dao.PlatformJkLoanApplyDao;

/**
 * ClassName:PlatformJkLoanApplyServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年3月16日 下午5:23:23 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@Service("platformJkLoanApplyServiceImpl")
public class PlatformJkLoanApplyServiceImpl implements PlatformJkLoanApplyService {
	
	@Autowired
	private PlatformJkLoanApplyDao platformJkLoanApplyDao;

	@Override
	public PlatformJkLoanApplyBean queryForApplyNo(String applyNo) {
		
		return platformJkLoanApplyDao.queryForApplyNo(applyNo);
	}

	@Override
	public void insertOrUpdatePlatformJkLoanApply(
			PlatformJkLoanApplyBean platformJkLoanApplyBean) {
		
		platformJkLoanApplyDao.insertOrUpdatePlatformJkLoanApply(platformJkLoanApplyBean);
	}


}

