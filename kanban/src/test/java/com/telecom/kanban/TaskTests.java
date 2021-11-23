package com.telecom.kanban;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.telecom.domain.Developper;
import com.telecom.domain.Task;
import com.telecom.repository.DevelopperRepository;
import com.telecom.repository.TaskRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TaskTests {

	    @Autowired
	    private TaskRepository taskRepository;
	    
	    @Autowired
	    private DevelopperRepository devRepository;

	    @Test
	    public void addDevelopper() {
	        Task t1 = new Task();
	        taskRepository.save(t1);
	        Developper d1 = new Developper();
	        devRepository.save(d1);
	        t1.addDevelopper(d1);
	        Set<Developper> devs = t1.getDeveloppers();
	        assertTrue(devs.contains(d1));	
	    
	    }
}
