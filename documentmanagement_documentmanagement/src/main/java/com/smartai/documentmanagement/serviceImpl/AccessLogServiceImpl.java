package com.smartai.documentmanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

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
	public List<AccessLog> getAllAccessLogs() {
		// TODO Auto-generated method stub
		return accessLogRepository.findAll();
	}

	@Override
	public Optional<AccessLog> getAccessLogById(Long id) {
		// TODO Auto-generated method stub
		return accessLogRepository.findById(id);
	}

	@Override
	public AccessLog createAccessLog(AccessLog accessLog) {
		// TODO Auto-generated method stub
		return accessLogRepository.save(accessLog);
	}

	@Override
	public AccessLog updateAccessLog(Long id, AccessLog accessLogDetails) {
		// TODO Auto-generated method stub
		return accessLogRepository.findById(id)
				.map(log->{
					log.setUserId(accessLogDetails.getUserId());
                    log.setDocumentId(accessLogDetails.getDocumentId());
                    log.setAccessType(accessLogDetails.getAccessType());
                    log.setTimestamp(accessLogDetails.getTimestamp());
                    return accessLogRepository.save(log);
				})
				.orElseThrow(()-> new RuntimeException(""));
	}

	@Override
	public void deleteAccessLog(Long id) {
		// TODO Auto-generated method stub
		
	}

	

}
