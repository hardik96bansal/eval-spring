package com.tech.eval.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(value="CourseStudent", description="DAO Model for CourseStudent Entity")
@IdClass(CourseStudentId.class)
public class CourseStudent {
    @Id
    int courseId;

    @Id
    int studentId;
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
    public CourseStudent() {
    }
    public CourseStudent(int courseId, int studentId) {
        this.courseId = courseId;
        this.studentId = studentId;
    }
}
