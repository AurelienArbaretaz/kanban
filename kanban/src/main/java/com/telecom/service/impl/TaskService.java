package com.telecom.service.impl;

import java.util.Collection;

import com.telecom.domain.Task;
import com.telecom.repository.TaskRepository;

public interface TaskService {
	Collection findAllTasks(TaskRepository repository);
	Task findTask(Long id,TaskRepository repository);
	Task moveRightTask(Task task,TaskRepository repository);
	Task moveLeftTask(Task task,TaskRepository repository);
}
