package com.tech.eval.service;

import com.tech.eval.model.CourseStudent;
import com.tech.eval.repository.CourseStudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseStudentService {
    
    @Autowired
    CourseStudentRepository courseStudentRepository;

    public void addStudentToCourse(int courseId, int studentId){
        CourseStudent courseStudent = new CourseStudent(courseId, studentId);
        courseStudentRepository.save(courseStudent);
    }

    public void removeStudentFromCourse(int courseId, int studentId){
        CourseStudent courseStudent = new CourseStudent(courseId, studentId);
        courseStudentRepository.delete(courseStudent);
    }
}
