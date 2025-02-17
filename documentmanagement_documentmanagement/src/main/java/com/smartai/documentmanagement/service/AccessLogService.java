package com.smartai.documentmanagement.service;

import java.util.List;

import com.smartai.documentmanagement.entity.AccessLog;

public interface AccessLogService {
	AccessLog logAccess(AccessLog accessLog);
	List<AccessLog> getAccessLogByDocument(Long documentId);
	List<AccessLog> getAccessLogByUser(Long userId);
}
