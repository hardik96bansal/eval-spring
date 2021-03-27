package com.tech.eval.repository;

import java.util.List;
import java.util.Optional;

import com.tech.eval.model.Student;
import com.tech.eval.constants.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    public Optional<Student> findById(Integer courseId);
    
    @Query(QueryConstants.coursesOfStudent)
    List<String> findCoursesOfStudent(@Param("id") int studentId);

    @Query(QueryConstants.totalCourseDurationOfStudent)
    int getTotalCourseDurationOfStudent(@Param("id") int studentId);
}
