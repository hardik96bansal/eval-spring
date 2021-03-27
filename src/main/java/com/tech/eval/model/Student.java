package com.tech.eval.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(value="Student", description="DAO Model for Student Entity")
public class Student {
    @Id
    int ID;
    String FirstName;
    String LastName;
    String Phone;
    public Student() {
    }
    public Student(int iD, String firstName, String lastName, String phone) {
        ID = iD;
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
