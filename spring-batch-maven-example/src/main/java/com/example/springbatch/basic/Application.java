package com.example.springbatch.basic;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	/**
	 * @param args
	 * @throws JobExecutionAlreadyRunningException
	 * @throws JobRestartException
	 * @throws JobInstanceAlreadyCompleteException
	 * @throws JobParametersInvalidException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException, InterruptedException {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-batch-core.xml", "spring-batch-database.xml", "batch-job.xml");
		
		JobLauncher jobLauncher = context.getBean("jobLauncher", JobLauncher.class);
		
		Job job = context.getBean("simpleJob", Job.class);
		JobParameters jobParameters = new JobParameters();
		JobExecution jobExecution = jobLauncher.run(job, jobParameters );
		System.out.println("Job status  :::::: " + jobExecution.getStatus());
		
		BatchStatus batchStatus = jobExecution.getStatus();
		
		/*while (batchStatus.isRunning()) {
			Thread.sleep(1000);
			batchStatus = jobExecution.getStatus();
		}*/
		
		
		System.out.println("Exit Status:::: " + batchStatus.toString());

	}

}
