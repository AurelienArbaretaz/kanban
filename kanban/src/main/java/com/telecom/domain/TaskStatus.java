package com.telecom.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class TaskStatus {
	@Id	
	@GeneratedValue
	private long id;
	private String label;
	public TaskStatus() {
		
	}
	public TaskStatus(String string) {
		this.label = string;
	}
}
