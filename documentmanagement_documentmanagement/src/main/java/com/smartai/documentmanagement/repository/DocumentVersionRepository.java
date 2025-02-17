package com.smartai.documentmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartai.documentmanagement.entity.DocumentVersion;

public interface DocumentVersionRepository extends JpaRepository<DocumentVersion, Long>{

//	DocumentVersion save(DocumentVersion version);
//
//	Optional<DocumentVersion> findById(Long id);
//
	List<DocumentVersion> findByDocumentId(Long documentId);
//
//	void deleteById(Long id);

	
}
