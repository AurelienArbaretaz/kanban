package com.telecom.kanban;


import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.telecom.domain.Developper;
import com.telecom.domain.Task;
import com.telecom.repository.DevelopperRepository;
import com.telecom.repository.TaskRepository;
import com.telecom.service.impl.DevelopperServiceImpl;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@DataJpaTest
public class DevelopperRepositoryTests {

	    @Autowired
	    private  DevelopperRepository developperRepository;
	    
	    @Test
	    public void findAllDevTest() {
	    	Task t1 =new Task();
	    	Date date = new Date(11,04,1999);
	        Developper d1 = new Developper("firstname","lastname","password","email",date );
	        t1.addDevelopper(d1);
	        developperRepository.save(d1);
	        Developper d2 = new Developper("firstname2","lastname2","password2","email2",date );
	        t1.addDevelopper(d2);
	        developperRepository.save(d2);
	    	List<Developper> devs = developperRepository.findAll();
	    	List<Developper> devs2 = Arrays.asList(d1,d2);
	        assertEquals(devs,devs2);
	    }
}

