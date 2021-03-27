package com.tech.eval.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(value="Course", description="DAO Model for Course Entity")
public class Course {
    @Id
    int ID;
    String DepartmentName;
    int InstructorId;
    int Duration;
    String Name;
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getDepartmentName() {
        return DepartmentName;
    }
    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }
    public int getInstructorId() {
        return InstructorId;
    }
    public void setInstructorId(int instructorId) {
        InstructorId = instructorId;
    }
    public int getDuration() {
        return Duration;
    }
    public void setDuration(int duration) {
        Duration = duration;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Course() {
    }
    public Course(int iD, String departmentName, int instructorId, int duration, String name) {
        ID = iD;
        DepartmentName = departmentName;
        InstructorId = instructorId;
        Duration = duration;
        Name = name;
    }
    
}
