package com.smartai.documentmanagement.service;

import java.util.List;
import java.util.Optional;

import com.smartai.documentmanagement.entity.DocumentVersion;

public interface DocumentVersionService {
	DocumentVersion saveDocumentVersion(DocumentVersion version);
    Optional<DocumentVersion> getVersionById(Long id);
    List<DocumentVersion> getAllVersionsByDocument(Long documentId);
    void deleteVersion(Long id);
}
