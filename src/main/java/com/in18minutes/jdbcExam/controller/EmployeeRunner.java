package com.in18minutes.jdbcExam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in18minutes.jdbcExam.repository.JdbcRepository;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
    private JdbcRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Employee(10001,"Mercia Jeno",5000000));
		repository.insert(new Employee(10002,"Mercia Jeno I",5000000));
		repository.delete(10002);
		
	}

}
