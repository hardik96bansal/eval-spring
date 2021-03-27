package com.tech.eval.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(value="Instructor", description="DAO Model for Instructor Entity")
public class Instructor {
    @Id
    int ID;
    String DepartmentName;
    String headedBy;
    String FirstName;
    String LastName;
    String Phone;
    public Instructor() {
    }
    public Instructor(int iD, String departmentName, String headedBy, String firstName, String lastName, String phone) {
        ID = iD;
        DepartmentName = departmentName;
        this.headedBy = headedBy;
        FirstName = firstName;
        LastName = lastName;
        Phone = phone;
    }
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
    public String getHeadedBy() {
        return headedBy;
    }
    public void setHeadedBy(String headedBy) {
        this.headedBy = headedBy;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }
}
