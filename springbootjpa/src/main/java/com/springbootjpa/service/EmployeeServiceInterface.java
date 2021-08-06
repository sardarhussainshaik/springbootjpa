package com.springbootjpa.service;

import com.springbootjpa.entity.Employee;

public interface EmployeeServiceInterface {
	public Employee viewprofile(Employee e);

	public String createprofileService(Employee e);

	public String deleteprofile(Employee e);

	public String editprofile(Employee ee);

	

}
