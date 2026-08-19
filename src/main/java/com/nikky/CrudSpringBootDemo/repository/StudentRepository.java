package com.nikky.CrudSpringBootDemo.repository;

import com.nikky.CrudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public Student saveStudent(Student student){
        //save to db
        System.out.println("Inside studentRepository.saveStudent");
        return null;
    }
}
