package com.smartai.documentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartai.documentmanagement.entity.AccessLog;

public interface AccessLogRepository extends JpaRepository<AccessLog, Long>{

}
