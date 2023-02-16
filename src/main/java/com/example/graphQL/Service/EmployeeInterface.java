package com.example.graphQL.Service;

import java.util.List;

import com.example.graphQL.Entity.EmployeeEntity;

public interface EmployeeInterface {

	EmployeeEntity getEmp(int i);

	List<EmployeeEntity> getAllEmp();

	EmployeeEntity save(EmployeeEntity e);
}
