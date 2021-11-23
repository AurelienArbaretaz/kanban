package com.telecom.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class TaskType {
	@Id	
	@GeneratedValue
	private long id;
	private String label;
	
	public TaskType(){
		
	}

	public TaskType(String string) {
		this.label = string;
	}
}
