package com.tech.eval.repository;

import com.tech.eval.model.CourseStudent;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseStudentRepository extends JpaRepository<CourseStudent, Integer>{
    
    public void deleteByCourseIdAndStudentId(int courseId, int studentId);
}
