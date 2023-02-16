package com.example.graphQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.graphQL.Entity.EmployeeEntity;
import com.example.graphQL.Service.EmployeeService;

@SpringBootApplication
public class GraphQlApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService service;

	public static void main(String[] args) {
		SpringApplication.run(GraphQlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		EmployeeEntity emp1 = new EmployeeEntity();
		emp1.setEmpId("111111");
		emp1.setName("SOURAV");
		emp1.setProjectName("BG");
		emp1.setRole("SE");

		EmployeeEntity emp2 = new EmployeeEntity();
		emp2.setEmpId("22222");
		emp2.setName("SINGHA");
		emp2.setProjectName("AM");
		emp2.setRole("AC");

		this.service.save(emp1);
		this.service.save(emp2);
	}
}
