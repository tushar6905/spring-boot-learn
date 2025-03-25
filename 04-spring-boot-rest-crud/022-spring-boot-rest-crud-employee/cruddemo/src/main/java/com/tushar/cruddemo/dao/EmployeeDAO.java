package com.tushar.cruddemo.dao;

import com.tushar.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee>  findall();
}
