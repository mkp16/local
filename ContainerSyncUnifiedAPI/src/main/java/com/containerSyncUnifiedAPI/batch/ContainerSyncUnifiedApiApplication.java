package com.containerSyncUnifiedAPI.batch;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContainerSyncUnifiedApiApplication {
	
	@Autowired
	//@Qualifier("unifiedcontainersyncJob")
	private Job unifiedcontainersyncJob;

	@Autowired
	private JobLauncher jobLauncher;

	public static void main(String[] args) {
		SpringApplication.run(ContainerSyncUnifiedApiApplication.class, args);
	}
	
	@PostConstruct
	public void run() throws JobExecutionAlreadyRunningException, JobRestartException,
			JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		Map<String, JobParameter> maps = new HashMap<>();
		maps.put("time", new JobParameter(System.currentTimeMillis()));
		JobParameters parameters = new JobParameters(maps);
		System.out.println(" ==== Unified Contaiiner Sync Job Initiated ===="+System.currentTimeMillis());
		JobExecution shipmentUploadJobExecution = jobLauncher.run(unifiedcontainersyncJob, parameters);
		String status = "Container sync  Job Execution: " + shipmentUploadJobExecution.getStatus();
		System.out.println(status);
	}

}
