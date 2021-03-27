package com.tech.eval.controller;

import java.util.List;

import com.tech.eval.model.Department;
import com.tech.eval.service.DepartmentService;

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

@Api(value = "Department Controller", description = "REST APIs to fetch, add, update, delete Department")
@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    
    @ApiOperation(value = "Get List of all Departments", response = List.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/departments")
    public List<Department> getAlldepartments(){
        List<Department> departments = departmentService.getAlldepartments();
        return departments;
    }

    @ApiOperation(value = "Get Department details by Id", response = Department.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @GetMapping("/departments/{departmentId}")
    public Department getdepartmentById(@PathVariable("departmentId") String departmentId){
        Department departments = departmentService.getdepartmentByName(departmentId);
        return departments;
    }

    @ApiOperation(value = "Add a new Department", response = Void.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @PostMapping("/departments")
    public void adddepartment(@RequestBody Department department){
        departmentService.adddepartment(department);
    }

    @ApiOperation(value = "Update an existing Department", response = Void.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @PutMapping("/departments")
    public void updatedepartment(@RequestBody Department department){
        departmentService.updatedepartment(department);
    }

    @ApiOperation(value = "Delete an existing Department", response = Void.class)
    @ApiResponses(value = { 
                @ApiResponse(code = 200, message = "Success|OK"),
                @ApiResponse(code = 400, message = "Bad Request!"), 
                @ApiResponse(code = 404, message = "Data not found!"),
                @ApiResponse(code = 500, message = "Internal Server Error!") })
    @DeleteMapping("/departments/{departmentId}")
    public void deletedepartment(@PathVariable("departmentId") String departmentId){
        departmentService.deletedepartment(departmentId);
    }
}
