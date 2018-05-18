/**
 * Project Name:yahao-p2p
 * File Name:PlatformJkLoanApplyService.java
 * Package Name:com.midai.service
 * Date:2018年3月16日下午5:22:05
 *
*/

package com.seamount.spring.service.snaker.loan;

import com.seamount.spring.dao.PlatformJkLoanApplyBean;

/**
 * ClassName:PlatformJkLoanApplyService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年3月16日 下午5:22:05 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
public interface PlatformJkLoanApplyService {
	
	PlatformJkLoanApplyBean queryForApplyNo(String applyNo);
	
	void insertOrUpdatePlatformJkLoanApply(PlatformJkLoanApplyBean platformJkLoanApplyBean);

}

