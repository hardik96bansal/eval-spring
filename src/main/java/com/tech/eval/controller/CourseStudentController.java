package com.tech.eval.controller;

import com.tech.eval.service.CourseStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.*;

@Api(value = "CourseStudent Controller", description = "REST APIs to add, delete mapping between Students and Courses")
@RestController
public class CourseStudentController {
    
    @Autowired
    CourseStudentService courseStudentService;

    @ApiOperation(value = "Add student to a course", response = Void.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/addMapping/{courseId}/students/{studentId}")
    public void addStudentToCourse(@PathVariable int courseId, @PathVariable int studentId){
        courseStudentService.addStudentToCourse(courseId, studentId);
    }

    @ApiOperation(value = "Remove student from a course", response = Void.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/removeMapping/{courseId}/students/{studentId}")
    public void removeStrudentFromCourse(@PathVariable int courseId, @PathVariable int studentId){
        courseStudentService.removeStudentFromCourse(courseId, studentId);
    }

}
