package com.example.jiraspring.repositories;

import com.example.jiraspring.Entities.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
}


