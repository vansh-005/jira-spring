package com.example.jiraspring.repositories;

import com.example.jiraspring.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
