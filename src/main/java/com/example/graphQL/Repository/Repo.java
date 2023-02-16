package com.example.graphQL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.graphQL.Entity.EmployeeEntity;

public interface Repo extends JpaRepository<EmployeeEntity, Integer>{

}
