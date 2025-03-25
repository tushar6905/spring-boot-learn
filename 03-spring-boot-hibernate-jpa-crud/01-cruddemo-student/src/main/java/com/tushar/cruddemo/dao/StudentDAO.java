package com.tushar.cruddemo.dao;

import com.tushar.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void  save (Student newStudent);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);
    void update(Student theStudent);
    void delete(Integer Id);
    int deleteAll();
}
