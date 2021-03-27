package com.tech.eval.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(value="Department", description="DAO Model for Department Entity")
public class Department {
    @Id
    String name;
    String Location;
    
    public Department(String name, String location) {
        this.name = name;
        Location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Department() {
    }
}
