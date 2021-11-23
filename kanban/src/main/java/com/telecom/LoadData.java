package com.telecom;

import java.sql.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.telecom.domain.Developper;
import com.telecom.domain.Task;
import com.telecom.domain.TaskStatus;
import com.telecom.domain.TaskType;
import com.telecom.repository.DevelopperRepository;
import com.telecom.repository.TaskRepository;
import com.telecom.repository.TaskStatusRepository;
import com.telecom.repository.TaskTypeRepository;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadData {
	@Bean
	@Profile("!test")
	CommandLineRunner initDatabase(DevelopperRepository developperRepository,
			TaskRepository taskRepository,
			TaskStatusRepository taskStatusRepository,
			TaskTypeRepository taskTypeRepository) {
		return args->{
			initTaskStatusAndType(taskStatusRepository,taskTypeRepository,taskRepository);
			initDevelopper(developperRepository);
		};
	}

	@SuppressWarnings("restriction")
	private void initDevelopper(DevelopperRepository developperRepository) {
	    Date date1 = new Date(2020,04,11);
		Developper dev1 = new Developper("Aurelien", "arbaretaz","aurelien.arbaretaz@orange.fr","monpass",date1);
		developperRepository.save(dev1);
		Date date2 = new Date(2023,04,11);
		Developper dev2 = new Developper("Michel", "Blanc","aurelien.arbaretaz@orange.fr","monpass",date2);
		developperRepository.save(dev2);
	
	}

	private void initTaskStatusAndType(TaskStatusRepository taskStatusRepository,
			TaskTypeRepository taskTypeRepository,TaskRepository taskRepository) {
		Task t1 = new Task();
		TaskType tt1 =new TaskType("Front");
		taskTypeRepository.save(tt1);
		TaskStatus ts1 =new TaskStatus("End");
		taskStatusRepository.save(ts1);
		t1.setStatus(ts1);
		t1.setType(tt1);
		taskRepository.save(t1);
		Task t2 = new Task();
		TaskType tt2 =new TaskType("Back");
		taskTypeRepository.save(tt2);
		TaskStatus ts2 =new TaskStatus("Start");
		taskStatusRepository.save(ts2);
		t2.setStatus(ts2);
		t2.setType(tt2);
		taskRepository.save(t2);
	}
	

}
