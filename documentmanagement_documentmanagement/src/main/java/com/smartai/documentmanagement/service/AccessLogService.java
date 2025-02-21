package com.smartai.documentmanagement.service;

import java.util.List;
import java.util.Optional;

import com.smartai.documentmanagement.entity.AccessLog;

public interface AccessLogService {
	AccessLog logAccess(Long userId, Long documentId, String accessType);
	List<AccessLog> getLogsByUser(Long userId);
	List<AccessLog> getLogsByDocument(Long documentId);
}
