package com.ems.workflow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Transition {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    @ManyToOne
    private Task source;
    
    @ManyToOne
    private Task target;

	public Transition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transition(Long id, String name, Task source, Task target) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.target = target;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Task getSource() {
		return source;
	}

	public void setSource(Task source) {
		this.source = source;
	}

	public Task getTarget() {
		return target;
	}

	public void setTarget(Task target) {
		this.target = target;
	}
}
