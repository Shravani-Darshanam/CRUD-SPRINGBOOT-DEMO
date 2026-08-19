package com.nikky.CrudSpringBootDemo.controller;

import com.nikky.CrudSpringBootDemo.entity.Student;
import com.nikky.CrudSpringBootDemo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
class StudentController{

    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public String create(@RequestBody Student student){
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
        System.out.println("Inside StudentController.create");
        Student createdStudent=studentService.createStudent(student);
        System.out.println("Exiting StudentController.create");
        return "Student created successfully";


    }
}