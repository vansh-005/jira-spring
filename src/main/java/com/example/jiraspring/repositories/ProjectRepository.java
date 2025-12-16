package com.example.jiraspring.repositories;

import com.example.jiraspring.Entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
