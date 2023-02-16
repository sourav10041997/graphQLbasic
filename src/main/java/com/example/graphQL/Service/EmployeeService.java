package com.example.graphQL.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.graphQL.Entity.EmployeeEntity;
import com.example.graphQL.Repository.Repo;

@Service
public class EmployeeService implements EmployeeInterface {

	private Repo repo;

	@Autowired
	public EmployeeService(Repo repo) {
		this.repo = repo;
	}

	@Override
	public EmployeeEntity getEmp(int i) {
		return this.repo.findById(i).orElseThrow(()->new RuntimeException("Some error is occuring!"));
	}

	@Override
	public List<EmployeeEntity> getAllEmp() {

		return this.repo.findAll();
	}

	@Override
	public EmployeeEntity save(EmployeeEntity e) {
		return this.repo.save(e);
	}

}
