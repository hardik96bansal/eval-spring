package com.tech.eval.service;

import java.util.List;

import com.tech.eval.model.Instructor;
import com.tech.eval.repository.InstructorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorService {

    @Autowired
    InstructorRepository InstructorRepository;

    public List<String> getStudentsOfInstructor(int instructorId){
        return InstructorRepository.findStudentsOfInstructor(instructorId);
    }

    public List<Instructor> getAllInstructors() {
        return InstructorRepository.findAll();
    }

    public Instructor getInstructorById(int InstructorId) {
        return InstructorRepository.findById(InstructorId).orElse(null);
    }

    public void addInstructor(Instructor Instructor) {
        InstructorRepository.save(Instructor);
    }

    public void updateInstructor(Instructor Instructor) {
        Instructor existing = InstructorRepository.findById(Instructor.getID()).orElse(null);
        if(existing!=null) InstructorRepository.save(existing);
    }

    public void deleteInstructor(int InstructorId) {
        InstructorRepository.deleteById(InstructorId);
    }
    
}
