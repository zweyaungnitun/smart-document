package com.smartai.documentmanagement.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartai.documentmanagement.entity.AccessLog;
import com.smartai.documentmanagement.repository.AccessLogRepository;
import com.smartai.documentmanagement.service.AccessLogService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class AccessLogServiceImpl implements AccessLogService{
	
	public final AccessLogRepository accessLogRepository;

	@Override
	public AccessLog logAccess(AccessLog accessLog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccessLog> getAccessLogByDocument(Long documentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccessLog> getAccessLogByUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
