package com.tech.eval.controller;

import java.util.List;

import com.tech.eval.model.Instructor;
import com.tech.eval.service.InstructorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.*;

@Api(value = "Instructor Controller", description = "REST APIs to fetch, add, update, delete Instructor. Also to get a list of students mapped to an Instructor")
@RestController
public class InstructorController {
    @Autowired
    InstructorService instructorService;
    
    @ApiOperation(value = "Get List of all Instructors", response = List.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/instructors")
    public List<Instructor> getAllinstructors(){
        List<Instructor> instructors = instructorService.getAllInstructors();
        return instructors;
    }

    @ApiOperation(value = "Get Instructor Detials by Id", response = Instructor.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/instructors/{instructorId}")
    public Instructor getinstructorById(@PathVariable("instructorId") int instructorId){
        Instructor instructors = instructorService.getInstructorById(instructorId);
        return instructors;
    }

    @ApiOperation(value = "Get List of Students mapped to an Instructor", response = List.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/instructors/{instructorId}/students")
    public List<String> getStudentsOfInstructors(@PathVariable("instructorId") int instructorId){
        List<String> instructors = instructorService.getStudentsOfInstructor(instructorId);
        return instructors;
    }

    @ApiOperation(value = "Add a new Instructor", response = Void.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @PostMapping("/instructors")
    public void addinstructor(@RequestBody Instructor instructor){
        instructorService.addInstructor(instructor);
    }

    @ApiOperation(value = "Update an existing Instructor", response = Void.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @PutMapping("/instructors")
    public void updateinstructor(@RequestBody Instructor instructor){
        instructorService.updateInstructor(instructor);
    }

    @ApiOperation(value = "Delete an existing Instructor", response = Void.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @DeleteMapping("/instructors/{instructorId}")
    public void deleteinstructor(@PathVariable("instructorId") int instructorId){
        instructorService.deleteInstructor(instructorId);
    }
}
