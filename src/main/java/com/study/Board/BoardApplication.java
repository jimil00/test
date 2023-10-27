package com.study.Board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BoardApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BoardApplication.class, args);
		
		System.out.println("다시 안녕");
		System.out.println("안녕 나는 슈");
	}
	

}
