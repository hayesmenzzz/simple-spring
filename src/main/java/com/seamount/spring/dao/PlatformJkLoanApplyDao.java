/**
 * Project Name:yahao-p2p
 * File Name:PlatformJkLoanApplyDao.java
 * Package Name:com.midai.dao
 * Date:2018年3月16日下午5:00:09
 *
*/

package com.seamount.spring.dao;

import com.seamount.spring.dao.PlatformJkLoanApplyBean;

/**
 * ClassName:PlatformJkLoanApplyDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年3月16日 下午5:00:09 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
public interface PlatformJkLoanApplyDao {
	
	PlatformJkLoanApplyBean queryForApplyNo(String applyNo);
	
	void insertOrUpdatePlatformJkLoanApply(PlatformJkLoanApplyBean platformJkLoanApplyBean);

}

