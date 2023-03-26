package com.je.department.dao.impl;

import com.je.department.dao.DepartmentDAO;
import com.je.department.entity.Department;
import com.je.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepartmentDaoImpl implements DepartmentDAO {

    @Autowired
    private DepartmentRepository repo;
    @Override
    public Department saveDepartment(Department department) {
        return repo.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return repo.findByDepartmentId(departmentId);
    }
}
