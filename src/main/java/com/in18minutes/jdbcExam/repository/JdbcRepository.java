package com.in18minutes.jdbcExam.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in18minutes.jdbcExam.controller.Employee;

@Repository
public class JdbcRepository {
	@Autowired
	private JdbcTemplate employeeTemplate;
	
	private String INSERT_QUERY="""
			insert into employee values
			(?,?,?);
			""";
	
	private String DELETE_QUERY="""
			delete from employee 
			where id = ?;
			""";
	public void insert(Employee emp)
	{
		employeeTemplate.update(INSERT_QUERY,emp.getId(),emp.getEmployeeName(),emp.getEmployeeSalary());
	}
	
	public void delete(int id)
	{
		employeeTemplate.update(DELETE_QUERY,id);
	}

}
