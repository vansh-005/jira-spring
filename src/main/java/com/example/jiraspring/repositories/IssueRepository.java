package com.example.jiraspring.repositories;

import com.example.jiraspring.Entities.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {
}
