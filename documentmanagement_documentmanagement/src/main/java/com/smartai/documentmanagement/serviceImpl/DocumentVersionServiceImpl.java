package com.smartai.documentmanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.smartai.documentmanagement.entity.DocumentVersion;
import com.smartai.documentmanagement.repository.DocumentRepository;
import com.smartai.documentmanagement.repository.DocumentVersionRepository;
import com.smartai.documentmanagement.service.DocumentVersionService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class DocumentVersionServiceImpl implements DocumentVersionService{
	
	public final DocumentVersionRepository documentVersionRepository;
	
	@Override
	public DocumentVersion saveDocumentVersion(DocumentVersion version) {
		return documentVersionRepository.save(version);
	}

	@Override
	public Optional<DocumentVersion> getVersionById(Long id) {
		// TODO Auto-generated method stub
		return documentVersionRepository.findById(id);
	}

	@Override
	public List<DocumentVersion> getAllVersionsByDocument(Long documentId) {
		// TODO Auto-generated method stub
		return documentVersionRepository.findByDocumentId(documentId);
	}

	@Override
	public void deleteVersion(Long id) {
		documentVersionRepository.deleteById(id);
		
	}

}
