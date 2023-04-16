package com.ems.workflow.services;

import java.util.List;


import com.ems.workflow.entities.Workflow;


public interface WorkflowService {
	public List<Workflow> getWorkflows();
	public Workflow getWorkflow(long id);
	public Workflow createWorkflow(Workflow workflow);
	public Workflow updateWorkflow(Workflow workflow);
	public void deleteWorkflow(long parseLong);

}
