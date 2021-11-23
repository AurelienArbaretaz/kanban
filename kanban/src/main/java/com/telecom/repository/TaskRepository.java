package com.telecom.repository;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.domain.ChangeLog;
import com.telecom.domain.Developper;
import com.telecom.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long>{


}
