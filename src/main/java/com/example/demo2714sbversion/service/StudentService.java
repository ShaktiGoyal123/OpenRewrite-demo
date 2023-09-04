package com.example.demo2714sbversion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2714sbversion.entity.StudentEntity;
import com.example.demo2714sbversion.repository.StudentRepository;


import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentEntity> getAllStudent(){
        log.info("inside getAllStudent()");
        return studentRepository.findAll();
    }

}