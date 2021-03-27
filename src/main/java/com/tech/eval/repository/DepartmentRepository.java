package com.tech.eval.repository;

import java.util.Optional;

import com.tech.eval.model.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

    public Optional<Department> findByName(String courseId);

    public void deleteByName(String departmentName);
    
}
