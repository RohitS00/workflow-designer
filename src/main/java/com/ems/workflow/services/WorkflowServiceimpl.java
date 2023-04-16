package com.ems.workflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.workflow.dao.WorkflowRepository;
import com.ems.workflow.entities.Workflow;
@Service
public class WorkflowServiceimpl implements WorkflowService {
	private WorkflowRepository workflowRepository;
	public WorkflowServiceimpl(WorkflowRepository workflowRepository) {
		super();
		this.workflowRepository = workflowRepository;
	}
	@Override
	public List<Workflow> getWorkflows() {
		// TODO Auto-generated method stub
		return workflowRepository.findAll();
	}
	@Override
	public Workflow getWorkflow(long id) {
        return workflowRepository.findById((int) id).get();
    }
	@Override
	public Workflow createWorkflow(Workflow workflow) {
		return workflowRepository.save(workflow);
	}
	@Override
	public Workflow updateWorkflow(Workflow workflow) {
		workflowRepository.save(workflow);
		return workflow;
	}
	@Override
	public void deleteWorkflow(long parseLong) {
		Workflow w = workflowRepository.findById((int) parseLong).get();
		workflowRepository.delete(w);
	}
	
}
