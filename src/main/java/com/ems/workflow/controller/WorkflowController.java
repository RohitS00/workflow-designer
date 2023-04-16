package com.ems.workflow.controller;

import java.util.List;

import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.workflow.dao.WorkflowRepository;
import com.ems.workflow.entities.Workflow;
import com.ems.workflow.services.WorkflowService;

@RestController
public class WorkflowController {
    @Autowired
    private WorkflowService workflowService;
    
    @GetMapping("/workflows")
    public List<Workflow> getWorkflows() {
        return this.workflowService.getWorkflows();
    }
    
    @PostMapping("/workflows")
    public Workflow createWorkflow(@RequestBody Workflow workflow) {
        return this.workflowService.createWorkflow(workflow);
    }
    
    @GetMapping("/workflows/{id}")
    public Workflow getWorkflow(@PathVariable String id) {
        return this.workflowService.getWorkflow(Long.parseLong(id));
    }
    
    @PutMapping("/workflows")
    public Workflow updateWorkflow(@RequestBody Workflow workflow) {// requestbody: maps HttpRequest body onto workflow  
        return this.workflowService.updateWorkflow(workflow);
    }
    
//    @DeleteMapping("/workflows/{id}")
//    public void deleteWorkflow(long parseLong) {
//        workflowService.deleteWorkflow(parseLong);
//        public ResponseEntity<HttpStatus> deleteFlow(@PathVariable String id){
//    		try {
//    			this.workflowService.deleteWorkflow(Long.parseLong(id));
//    			return new ResponseEntity<>(HttpStatus.OK);
//    		}
//    		catch(Exception e){
//    			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    		}
//    	}
//    }
}

