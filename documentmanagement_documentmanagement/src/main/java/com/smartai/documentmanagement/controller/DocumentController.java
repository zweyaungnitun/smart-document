package com.smartai.documentmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartai.documentmanagement.entity.Document;
import com.smartai.documentmanagement.service.DocumentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
@Controller
@RequestMapping("/api/documents")
@AllArgsConstructor
public class DocumentController {
	private final DocumentService documentService;
	@PostMapping
	public Document createDocument(@RequestBody Document document) {
		return documentService.saveDocument(document);
	}
	@GetMapping("/{id}")
	public Optional<Document> getDocument(@PathVariable Long id){
		return documentService.getDocumentById(id);
	}
	@GetMapping
	public List<Document> getAllDocuments(){
		return documentService.getAllDocuments();
	}
	@PutMapping("/{id}")
	public Document updateDocument(@PathVariable Long id , @RequestBody Document documentDetails) {
		return documentService.updateDocument(id, documentDetails);
	}
	@DeleteMapping("/{id}")
	public void deleteDocument(@PathVariable Long id) {
		documentService.deleteDocument(id);
	}
	
}
