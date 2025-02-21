package com.smartai.documentmanagement.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smartai.documentmanagement.entity.AccessLog;
import com.smartai.documentmanagement.service.AccessLogService;

@RestController
@RequestMapping("/api/accesslogs")
public class AccessLogController {

    private final AccessLogService accessLogService;

    public AccessLogController(AccessLogService accessLogService) {
        this.accessLogService = accessLogService;
    }

    // ✅ Log user access
    @PostMapping("/log")
    public ResponseEntity<AccessLog> logAccess(
            @RequestParam Long userId,
            @RequestParam Long documentId,
            @RequestParam String accessType) {
        
        AccessLog accessLog = accessLogService.logAccess(userId, documentId, accessType);
        return ResponseEntity.ok(accessLog);
    }

    // ✅ Get access logs by user
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<AccessLog>> getLogsByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(accessLogService.getLogsByUser(userId));
    }

    // ✅ Get access logs by document
    @GetMapping("/document/{documentId}")
    public ResponseEntity<List<AccessLog>> getLogsByDocument(@PathVariable Long documentId) {
        return ResponseEntity.ok(accessLogService.getLogsByDocument(documentId));
    }
}
