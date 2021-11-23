package com.telecom.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.domain.Developper;
import com.telecom.domain.Task;
import com.telecom.repository.DevelopperRepository;
import com.telecom.repository.TaskRepository;

@Service
public class TaskServiceImpl {
	
	@Autowired
    private TaskRepository repository;
	
	
    public Collection findAllTasks(TaskRepository repository) {
    	this.repository = repository;
        return (Collection) repository.findAll();
    }
	
	
    public Optional<Task> findTask(Long id,TaskRepository repository) {
    	this.repository = repository;
        return repository.findById(id);
    }
	
	
    public Task moveRightTask(Task task,TaskRepository repository) {
    	this.repository = repository;
        return (Task) repository.findAll();
    }
	

    public Task moveLeftTask(Task task,TaskRepository repository) {
    	this.repository = repository;
        return (Task) repository.findAll();
    }
}
