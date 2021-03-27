package com.tech.eval.service;

import java.util.List;

import com.tech.eval.model.Student;
import com.tech.eval.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository StudentRepository;

    public List<String> getAllCoursesOfStudent(int studentId){
        List<String> courses = StudentRepository.findCoursesOfStudent(studentId);
        return courses;
    }

    public int getTotalCourseDurationOfStudent(int studentId){
        int duration = StudentRepository.getTotalCourseDurationOfStudent(studentId);
        return duration;
    }

    public List<Student> getAllStudents() {
        return StudentRepository.findAll();
    }

    public Student getStudentById(int StudentId) {
        return StudentRepository.findById(StudentId).orElse(null);
    }

    public void addStudent(Student Student) {
        StudentRepository.save(Student);
    }

    public void updateStudent(Student Student) {
        Student existing = StudentRepository.findById(Student.getID()).orElse(null);
        if(existing!=null) StudentRepository.save(existing);
    }

    public void deleteStudent(int StudentId) {
        StudentRepository.deleteById(StudentId);
    }
    
}
