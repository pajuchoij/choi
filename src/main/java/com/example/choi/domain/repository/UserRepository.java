package com.example.choi.domain.repository;

import com.example.choi.domain.entity.UserInfo;
import com.example.choi.dto.UserInfoDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
    Optional<UserInfo> findById(String id);




}