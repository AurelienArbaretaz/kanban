package com.telecom.domain;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.ToString;


@Data
@Entity
public class ChangeLog {
	@Id	
	@GeneratedValue
	private long id;
	private Date occured;
	@ManyToOne
	@ToString.Exclude
	private Task tasks;
	@ManyToOne
	private TaskStatus sourceStatus;
	@ManyToOne
	private TaskStatus targetStatus;	
	public ChangeLog() {
		
	}
}
