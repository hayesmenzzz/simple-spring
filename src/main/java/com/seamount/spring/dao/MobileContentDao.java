package com.seamount.spring.dao;

public interface MobileContentDao {

	public void insertMobileMessageAudit(Integer messageType, String mobile, String content);
}
