package com.smartai.documentmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartai.documentmanagement.entity.AccessLog;

public interface AccessLogRepository extends JpaRepository<AccessLog, Long>{

	List<AccessLog> getAllAccessLog();

	List<AccessLog> findByUserId(Long userId);

	List<AccessLog> findByDocumentId(Long documentId);


}
