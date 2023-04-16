package com.ems.workflow.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.workflow.entities.Workflow;

@Repository
public interface WorkflowRepository extends JpaRepository<Workflow, Integer> {
}
