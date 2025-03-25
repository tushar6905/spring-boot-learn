package com.tushar.demo.rest;

import com.tushar.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;

    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Tushar","Sharma"));
        theStudents.add(new Student("Mamta","Thakur"));
        theStudents.add(new Student("Manish","Rajput"));
    }

    @GetMapping("/students")
    public List<Student> getStudent(){
    return theStudents;
    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        if((studentId>=theStudents.size()) || (studentId<0)){
            throw new StudentNotFoundException("Student Id not found : " + studentId);
        }
        return theStudents.get(studentId) ;
    }

}

