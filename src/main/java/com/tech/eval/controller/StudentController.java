package com.tech.eval.controller;

import java.util.List;

import com.tech.eval.model.Student;
import com.tech.eval.service.StudentService;

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
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Student Controller", description = "REST APIs to fetch, add, update, delete Student. Also to get total duration, and names of Courses opted by a Student")
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    
    @ApiOperation(value = "Get list of all Students", response = List.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/students")
    public List<Student> getAllstudents(){
        List<Student> students = studentService.getAllStudents();
        return students;
    }

    @ApiOperation(value = "Get Student detials by student id", response = Student.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/students/{studentId}")
    public Student getstudentById(@PathVariable("studentId") int studentId){
        Student students = studentService.getStudentById(studentId);
        return students;
    }

    @ApiOperation(value = "Get list of courses opted by a student", response = List.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/students/{studentId}/courses")
    public List<String> getAllCoursesOfStudent(@PathVariable("studentId") int studentId){
        List<String> courses = studentService.getAllCoursesOfStudent(studentId);
        return courses;
    }

    @ApiOperation(value = "Get total dration of all courses opted by a Student", response = List.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/students/{studentId}/courses/duration")
    public int getTotalCourseDurationOfStudent(@PathVariable("studentId") int studentId){
        int duration = studentService.getTotalCourseDurationOfStudent(studentId);
        return duration;
    }

    @ApiOperation(value = "Add new student")
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @PostMapping("/students")
    public void addstudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @ApiOperation(value = "Update the data for an existing student")
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @PutMapping("/students")
    public void updatestudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @ApiOperation(value = "Delete an existing Student")
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @DeleteMapping("/students/{studentId}")
    public void deletestudent(@PathVariable("studentId") int studentId){
        studentService.deleteStudent(studentId);
    }
}
