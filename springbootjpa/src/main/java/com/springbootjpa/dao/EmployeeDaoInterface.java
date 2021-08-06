package com.springbootjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootjpa.entity.Employee;

@Repository
public interface EmployeeDaoInterface extends JpaRepository<Employee, String>{



}
