package com.example.demo2714sbversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo2714sbversion.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
    
}