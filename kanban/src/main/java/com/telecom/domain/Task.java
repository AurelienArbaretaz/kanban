package com.telecom.domain;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
public class Task {
	@Id	
	@GeneratedValue
	private long id;
	private int nbHoursForecast;
	private int nbHoursReal;
	private Date Created;
	@ManyToOne
	private TaskType type;
	@ManyToOne
	private TaskStatus status;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private Set<Developper> developpers;
	
	@OneToMany(mappedBy="tasks",cascade= {CascadeType.ALL},orphanRemoval=true)
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private Set<ChangeLog> changeLogs;

	public Task() {
		this.developpers = new HashSet<>();
		
		this.changeLogs = new HashSet<>();
	}
	
	public void addDevelopper(Developper developper) {
		this.developpers.add(developper);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public TaskType getType() {
		return type;
	}

	public void setType(TaskType type) {
		this.type = type;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public Set<Developper> getDeveloppers() {
		return developpers;
	}

	public void setDeveloppers(Set<Developper> developpers) {
		this.developpers = developpers;
	}

	public Set<ChangeLog> getChangeLogs() {
		return changeLogs;
	}

	public void setChangeLogs(Set<ChangeLog> changeLogs) {
		this.changeLogs = changeLogs;
	}

	public int getNbHoursForecast() {
		return nbHoursForecast;
	}
	public void setNbHoursForecast(int nbHoursForecast) {
		this.nbHoursForecast = nbHoursForecast;
	}
	public int getNbHoursReal() {
		return nbHoursReal;
	}
	public void setNbHoursReal(int nbHoursReal) {
		this.nbHoursReal = nbHoursReal;
	}
	public Date getCreated() {
		return Created;
	}
	public void setCreated(Date created) {
		Created = created;
	}
}
