package com.smartai.documentmanagement.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.smartai.documentmanagement.entity.AccessLog;
import com.smartai.documentmanagement.entity.Document;
import com.smartai.documentmanagement.entity.User;
import com.smartai.documentmanagement.repository.AccessLogRepository;
import com.smartai.documentmanagement.repository.DocumentRepository;
import com.smartai.documentmanagement.repository.UserRepository;
import com.smartai.documentmanagement.service.AccessLogService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class AccessLogServiceImpl implements AccessLogService{
	
	private final AccessLogRepository accessLogRepository;
    private final UserRepository userRepository;
    private final DocumentRepository documentRepository;


    // ✅ Log Access
    public AccessLog logAccess(Long userId, Long documentId, String accessType) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Document document = documentRepository.findById(documentId)
                .orElseThrow(() -> new RuntimeException("Document not found"));

        AccessLog accessLog = new AccessLog();
        accessLog.setUser(user);
        accessLog.setDocument(document);
        accessLog.setAccessTime(LocalDateTime.now());
        accessLog.setAccessType(accessType);

        return accessLogRepository.save(accessLog);
    }

    // ✅ Get logs by user
    public List<AccessLog> getLogsByUser(Long userId) {
        return accessLogRepository.findByUserId(userId);
    }

    // ✅ Get logs by document
    public List<AccessLog> getLogsByDocument(Long documentId) {
        return accessLogRepository.findByDocumentId(documentId);
    }
	

}
