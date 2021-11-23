package com.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.domain.ChangeLog;


@Repository
public interface ChangeLogRepository extends JpaRepository<ChangeLog,Long>{

}
