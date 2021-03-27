package com.tech.eval.service;

import java.util.List;

import com.tech.eval.model.Department;
import com.tech.eval.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getAlldepartments() {
        return departmentRepository.findAll();
    }

    public Department getdepartmentByName(String departmentName) {
        return departmentRepository.findByName(departmentName).orElse(null);
    }

    public void adddepartment(Department department) {
        departmentRepository.save(department);
    }

    public void updatedepartment(Department department) {
        Department existing = departmentRepository.findByName(department.getName()).orElse(null);
        if(existing!=null) departmentRepository.save(existing);
    }

    public void deletedepartment(String departmentId) {
        departmentRepository.deleteByName(departmentId);
    }
    
}
