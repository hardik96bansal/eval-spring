package com.tech.eval.model;

import java.io.Serializable;

public class CourseStudentId implements Serializable{
    
    public int courseId;
    public int studentId;
    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public CourseStudentId() {
    }
    public CourseStudentId(int courseId, int studentId) {
        this.courseId = courseId;
        this.studentId = studentId;
    }

    
}
