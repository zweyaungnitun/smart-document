package com.smartai.documentmanagement.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.smartai.documentmanagement.entity.Document;
import com.smartai.documentmanagement.repository.DocumentRepository;
import com.smartai.documentmanagement.service.DocumentService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class DocumentServiceImpl implements DocumentService{
	
	private final DocumentRepository documentRepository;

	@Override
	public Document saveDocument(Document document) {
		document.setCreatedAt(LocalDateTime.now());
		return documentRepository.save(document);
	}

	@Override
	public Optional<Document> getDocumentById(Long id) {
		return documentRepository.findById(id);
	}

	@Override
	public List<Document> getAllDocuments() {
		return documentRepository.findAll();
	}

	@Override
	public Document updateDocument(Long id, Document documentDetails) {
		return documentRepository.findById(id)
				.map(document->{
					document.setTitle(documentDetails.getTitle());
					document.setDescription(documentDetails.getDescription());
					document.setUpdatedAt(LocalDateTime.now());
					return documentRepository.save(document);
				}).orElseThrow(()->new RuntimeException("Document Not Found"));
	}

	@Override
	public void deleteDocument(Long id) {
		documentRepository.deleteById(id);
		
	}

}
