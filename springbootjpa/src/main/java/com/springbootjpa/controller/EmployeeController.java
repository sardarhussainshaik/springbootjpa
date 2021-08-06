package com.springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjpa.entity.Employee;
import com.springbootjpa.service.EmployeeServiceInterface;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInterface es;
	
	@GetMapping("viewprofile/{id}")
	public Employee viewProfile(@PathVariable("id")String ss) {
		Employee e=new Employee();
		e.setEmail(ss);
		Employee e1=es.viewprofile(e);
		return e1;
	}
	@PostMapping("createprofile")
	public String s1(@RequestBody Employee e) {
		String ss=es.createprofileService(e);
		
		return ss;
		
	}
	@DeleteMapping("deleteprofile/{id}")
	public String deleteProfile(@PathVariable("id")String ss) {
		Employee e=new Employee();
		e.setEmail(ss);
		String e1=es.deleteprofile(e);
		return e1;
	}
	@PutMapping("editprofile/{id}")
	
	public String editProfile(@PathVariable("id")String ss,@RequestBody Employee ee) {
		/*
		 * Employee e=new Employee(); e.setEmail(ss);
		 */
		String e1=es.editprofile(ee);
		return e1;
	}
	
	
	

	

}
