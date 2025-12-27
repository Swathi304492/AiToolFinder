package com.aiToolFinder.aiToolFinder.repository;

import com.aiToolFinder.aiToolFinder.entity.Tool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToolRepository extends JpaRepository<Tool,Long> {
}
