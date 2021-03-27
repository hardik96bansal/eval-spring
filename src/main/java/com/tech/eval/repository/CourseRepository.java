package com.tech.eval.repository;

import java.util.Optional;

import com.tech.eval.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    public Optional<Course> findById(Integer courseId);
    
}
