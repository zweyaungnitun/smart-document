package com.smartai.documentmanagement.service;

import java.util.List;
import java.util.Optional;

import com.smartai.documentmanagement.entity.Document;

public interface DocumentService {
	Document saveDocument(Document document);
	Optional<Document> getDocumentById(Long id);
	List<Document> getAllDocuments();
    Document updateDocument(Long id, Document documentDetails);
    void deleteDocument(Long id);
}
