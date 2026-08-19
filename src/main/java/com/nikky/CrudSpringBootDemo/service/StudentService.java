package com.nikky.CrudSpringBootDemo.service;

import com.nikky.CrudSpringBootDemo.entity.Student;
import com.nikky.CrudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService{

    StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
 public Student createStudent(Student studentReq){
     //business logic
     //store db
     System.out.println("Inside StudentService.saveStudent");
     Student studentResponse= studentRepository.saveStudent(studentReq);
     return studentResponse;
 }
}
