package com.tech.eval.repository;

import java.util.List;
import java.util.Optional;

import com.tech.eval.model.Instructor;
import com.tech.eval.constants.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

    public Optional<Instructor> findById(Integer courseId);
    
    @Query(QueryConstants.studentsOfInstructor)
    List<String> findStudentsOfInstructor(@Param("id") int instructorId);
}
