package com.telecom.service.impl;

import com.telecom.repository.DevelopperRepository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.domain.Developper;

@Service
public class DevelopperServiceImpl implements DeveloperService{
	
	@Autowired
    private DevelopperRepository repository;

	@Autowired
    public List<Developper> findAll(DevelopperRepository repository) {
    	this.repository = repository;
        return (List<Developper>) repository.findAll();
    }
}
