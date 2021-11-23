package com.telecom.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.domain.TaskType;

@Repository
public interface TaskTypeRepository extends JpaRepository<TaskType,Long>{

}
