package com.tushar.cruddemo.dao;

import com.tushar.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }

    @Override
    public List<Employee> findall() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee",Employee.class);
        List<Employee> employees=theQuery.getResultList();
        return employees;
    }
}
