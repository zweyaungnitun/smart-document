package com.smartai.documentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartai.documentmanagement.entity.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

}
