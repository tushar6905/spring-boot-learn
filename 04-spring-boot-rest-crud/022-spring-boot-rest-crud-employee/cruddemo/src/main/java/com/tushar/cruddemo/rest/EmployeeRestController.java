package com.tushar.cruddemo.rest;

import com.tushar.cruddemo.entity.Employee;
import com.tushar.cruddemo.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
//    private EmployeeDAO employeeDAO;
    private EmployeeService employeeService;
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService=theEmployeeService;
    }

    @GetMapping("/employees")
    public List <Employee> findall(){
        return employeeService.findall();
    }
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee theEmployee =employeeService.findById(employeeId);

        if(theEmployee == null){
            throw new RuntimeException("Employee id not found : "+ theEmployee);
        }
        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(0);
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }
    @PutMapping("/emplyoees")
    public Employee updateEmplyoee(@RequestBody Employee theEmployee){
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

}
