package com.je.department.controller;

import com.je.department.entity.Department;
import com.je.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        return service.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return service.getDepartmentById(departmentId);
    }

}
