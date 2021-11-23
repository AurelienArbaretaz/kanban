package com.telecom.repository;

import java.util.List;


import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telecom.domain.ChangeLog;
import com.telecom.domain.Developper;

@Repository
public interface DevelopperRepository extends JpaRepository<Developper,Long>{


}
