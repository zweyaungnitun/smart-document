package com.smartai.documentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartai.documentmanagement.entity.User;

public interface UserRepository extends JpaRepository<User , Long> {
    
}
