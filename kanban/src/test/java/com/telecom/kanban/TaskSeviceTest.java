package com.telecom.kanban;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.junit4.SpringRunner;

import com.telecom.domain.Task;
import com.telecom.repository.TaskRepository;
import com.telecom.service.impl.DevelopperServiceImpl;
import com.telecom.service.impl.TaskServiceImpl;

@AutoConfigureMockMvc
@DataJpaTest
public class TaskSeviceTest {
	
	@Autowired
    private  TaskRepository taskRepository;
	
	@Test
	public void findAllTasksTest() {
		TaskServiceImpl taskServiceImpl = new TaskServiceImpl();
		Task t1 = new Task();
		taskRepository.save(t1);
		Task t2 =new Task();
		taskRepository.save(t2);
		Collection tasks = taskServiceImpl.findAllTasks(taskRepository);
		List<Task> task2 = Arrays.asList(t1,t2);
        assertEquals(tasks,task2);
	}
	
	@Test
	public void findTaskTest() {
		Task t1 = new Task();
		taskRepository.save(t1);
		TaskServiceImpl taskServiceImpl = new TaskServiceImpl();
		Optional<Task> task = taskRepository.findById((long) 1);
		assertEquals(Optional.of(t1),task);
	}
	public void moveRightTask() {
		
	}
	public void moveLeftTask() {
		
	}
}
