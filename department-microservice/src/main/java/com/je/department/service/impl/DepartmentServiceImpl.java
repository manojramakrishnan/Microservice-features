package com.je.department.service.impl;

import com.je.department.dao.DepartmentDAO;
import com.je.department.entity.Department;
import com.je.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {


    @Autowired
    private DepartmentDAO dao;
    @Override
    public Department saveDepartment(Department department) {
        return dao.saveDepartment(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return dao.getDepartmentById(departmentId);
    }
}
