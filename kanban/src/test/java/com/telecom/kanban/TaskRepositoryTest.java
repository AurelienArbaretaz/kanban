package com.telecom.kanban;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.junit4.SpringRunner;

import com.telecom.domain.Developper;
import com.telecom.domain.Task;
import com.telecom.repository.DevelopperRepository;
import com.telecom.repository.TaskRepository;
import com.telecom.service.impl.DevelopperServiceImpl;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@DataJpaTest
public class TaskRepositoryTest {
	
	@Autowired
    private  TaskRepository taskRepository;
	
	@Test
    public void saveTaskTest() {
    	Task t1 =new Task();
    	taskRepository.save(t1);
    	List<Task> tasks = taskRepository.findAll();
        assertTrue(tasks.contains(t1));
    }
	
	@Test
    public void findAllTaskTest() {
    	Task t1 =new Task();
    	taskRepository.save(t1);
    	Task t2 =new Task();
    	taskRepository.save(t2);
    	List<Task> task = taskRepository.findAll();
    	List<Task> task2 = Arrays.asList(t1,t2);
        assertEquals(task,task2);
    }
	
	
}
