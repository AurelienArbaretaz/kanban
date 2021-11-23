package com.telecom.repository;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.domain.ChangeLog;
import com.telecom.domain.TaskStatus;

@Repository
public interface TaskStatusRepository extends JpaRepository<TaskStatus,Long>{

}
