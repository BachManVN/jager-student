package com.jager.student.controller;

import com.jager.student.entity.StudentInfoEntity;
import com.jager.student.reporsitory.StudentInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentInfoController {

    @Autowired
    private StudentInfoRepo studentInfoRepo;
    
    @GetMapping(value = "/students", produces = "application/json")
    public ResponseEntity<List<StudentInfoEntity>> getAllStudent(){
        List<StudentInfoEntity> students = studentInfoRepo.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
