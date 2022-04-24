package com.app.BookMyShow.controllers;

import com.app.BookMyShow.models.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController{

    @GetMapping("/bms")
    List<Employee> all() {
        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee(1,"Manjushree");
        employeeList.add(e1);
        Employee e2 = new Employee(2, "Nishanth");
        employeeList.add(e2);
        return employeeList;
    }
}
