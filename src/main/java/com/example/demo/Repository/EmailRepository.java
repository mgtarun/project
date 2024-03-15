package com.example.demo.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel,UUID> {
    EmailModel findByEmail(String email);
}
