package com.springbootjpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjpa.dao.EmployeeDaoInterface;
import com.springbootjpa.entity.Employee;
@Service
public class EmployeeService implements EmployeeServiceInterface {
	
	
	@Autowired
	private EmployeeDaoInterface ed;
	@Override
	public Employee viewprofile(Employee e) {
		
		Optional<Employee> e1=ed.findById(e.getEmail());
		Employee e2=e1.get();
		
		return e2;
	}
	@Override
	public String createprofileService(Employee e) {
		ed.save(e);
		return "profile created";
	}
	@Override
	public String deleteprofile(Employee e) {
		ed.deleteById(e.getEmail());
		return "profile is deleted";
	}
	@Override
	public String editprofile(Employee ee) {
		ed.save(ee);
		return "profile edited";
	}
	
	

}
