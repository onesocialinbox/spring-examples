package com.example.springbatch.basic;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class SimpleTasklet implements Tasklet {

	public SimpleTasklet() {
		// TODO Auto-generated constructor stub
	}

	public RepeatStatus execute(StepContribution contribution,
			ChunkContext chunkContext) throws Exception {

		System.out.println("Hello..........");
		return RepeatStatus.FINISHED;
	}

	
}
