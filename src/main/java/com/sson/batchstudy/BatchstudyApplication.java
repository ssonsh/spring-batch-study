package com.sson.batchstudy;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing // 배치기능 활성화 애노테이션
@SpringBootApplication
public class BatchstudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchstudyApplication.class, args);
	}

}
