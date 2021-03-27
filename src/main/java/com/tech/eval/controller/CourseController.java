package com.tech.eval.controller;

import java.util.List;

import com.tech.eval.model.Course;
import com.tech.eval.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.*;

@Api(value = "Course Controller", description = "REST APIs to fetch, add, update, delete Courses")
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;
    
    @ApiOperation(value = "Get List of all Courses", response = List.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        List<Course> courses = courseService.getAllCourses();
        return courses;
    }

    @ApiOperation(value = "Get Course details by id", response = Course.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable("courseId") int courseId){
        Course courses = courseService.getCourseById(courseId);
        return courses;
    }

    @ApiOperation(value = "Add a new Course", response = Void.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @PostMapping("/courses")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @ApiOperation(value = "Update an existing Course", response = Void.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @PutMapping("/courses")
    public void updateCourse(@RequestBody Course course){
        courseService.updateCourse(course);
    }

    @ApiOperation(value = "Delete an existing Course", response = Void.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable("courseId") int courseId){
        courseService.deleteCourse(courseId);
    }

}
