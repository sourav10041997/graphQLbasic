package com.example.graphQL.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.graphQL.Entity.EmployeeEntity;
import com.example.graphQL.Service.EmployeeService;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

//	@PostMapping("/employee/{id}")
	@QueryMapping("getEmp")
	EmployeeEntity getEmp(@Argument int empId) {
		return service.getEmp(empId);

	}

//	@GetMapping("/employee/all")
	@QueryMapping("getAllEmp")
	List<EmployeeEntity> getAllEmp() {
		return service.getAllEmp();
	}

//	@PostMapping("/employee/save")
	@MutationMapping("createEmployee")
	EmployeeEntity save(@Argument EmployeeInput empId) {
		EmployeeEntity emp = new EmployeeEntity();
		emp.setEmpId(empId.getEmpId());
		emp.setName(empId.getName());
		emp.setProjectName(empId.getProjectName());
		emp.setRole(empId.getRole());
		return this.service.save(emp);
	}
}

@Getter
@Setter
class EmployeeInput {
	private String name;
	private String empId;
	private String role;
	private String projectName;
}
