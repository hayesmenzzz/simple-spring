package com.seamount.spring.dao;

import java.sql.Types;

public class MobileContentDaoImpl extends BaseDao implements MobileContentDao {

	@Override
	public void insertMobileMessageAudit(Integer messageType, String mobile, String content) {
		String sql = "insert into tbl_system_mobile_message_audit(messageType, mobile, mobileContent, sendDate) values(?, AES_ENCRYPT(?,'encrypt-string'), ?, now())";
		jdbcTemplate.update(sql, new Object[]{ messageType, mobile, content }, new int[]{ Types.INTEGER, Types.VARBINARY, Types.VARCHAR });
	}

}
