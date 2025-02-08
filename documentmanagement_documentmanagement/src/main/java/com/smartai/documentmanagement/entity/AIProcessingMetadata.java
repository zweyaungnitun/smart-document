package com.smartai.documentmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class AIProcessingMetadata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type; // Type of AI processing (e.g., "ocr", "auto-tagging")
    private String result; // Result of the AI processing

    @ManyToOne
    @JoinColumn(name = "document_id")
    private Document document;

}