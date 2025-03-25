package com.tushar.cruddemo.service;

import com.tushar.cruddemo.dao.EmployeeDAO;
import com.tushar.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findall();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);

}
