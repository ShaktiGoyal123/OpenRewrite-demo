package com.example.demo2714sbversion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2714sbversion.entity.StudentEntity;
import com.example.demo2714sbversion.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class StudentController {
    
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/hello")
    public String getHello(){
        log.info("inside controller");
        return "Hello! this is test message";
    }

    @GetMapping("/getStudents")
    public List<StudentEntity> getAllStudent(){
        return studentRepository.findAll();
    }
}
