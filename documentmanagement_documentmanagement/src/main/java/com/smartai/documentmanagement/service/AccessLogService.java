package com.smartai.documentmanagement.service;

import java.util.List;
import java.util.Optional;

import com.smartai.documentmanagement.entity.AccessLog;

public interface AccessLogService {
	List<AccessLog> getAllAccessLogs();
	Optional<AccessLog> getAccessLogById(Long id);
	AccessLog createAccessLog(AccessLog accessLog);
	AccessLog updateAccessLog(Long id, AccessLog accessLogDetails);
	void deleteAccessLog(Long id);
}
