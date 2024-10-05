package com.example.myapp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
@RequiredArgsConstructor
@Slf4j
public class Myapp2Application {
	
	private final Student student;

	@GetMapping("/name")	
	public String getStudentByName() {
		log.info("Student : {}", student);

		student.setName("일길동");
		return student.getName();
	}

	public static void main(String[] args) {
		SpringApplication.run(Myapp2Application.class, args);
	}

}
