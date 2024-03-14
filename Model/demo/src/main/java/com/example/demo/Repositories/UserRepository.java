package com.example.demo.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,UUID> {
    UserModel findByUserName(String userName);
}
