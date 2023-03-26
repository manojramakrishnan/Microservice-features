package com.je.department.dao;

import com.je.department.entity.Department;

public interface DepartmentDAO {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
