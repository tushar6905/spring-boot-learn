package com.tushar.cruddemo.service;

import com.tushar.cruddemo.dao.EmployeeDAO;
import com.tushar.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> findall() {
        return employeeDAO.findall();
    }

    @Override
    public Employee findById(int theId) {
        Employee theEmployee = entityManager.find(Employee.class, theId);
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        Employee dbEmployee = entityManager.merge(theEmployee);
        return dbEmployee ;
    }

    @Override
    public void deleteById(int theId) {
        Employee theEmployee = entityManager.find(Employee.class, theId);
        entityManager.remove(theEmployee);

    }
}

