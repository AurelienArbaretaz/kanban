package com.telecom.domain;

import java.sql.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
public class Developper {
	@Id
	@GeneratedValue
	private long id;
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private Date startContract;
	
	@ManyToMany(mappedBy="developpers",fetch=FetchType.EAGER)
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private Set<Task> tasks;
	
	public Developper(String firstname, String lastname, String password, String email, Date startContract) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.email = email;
		this.startContract = startContract;
	}
	public Developper() {
		this.tasks = new HashSet<>();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getStartContract() {
		return startContract;
	}
	public void setStartContract(Date startContract) {
		this.startContract = startContract;
	}
	
}
