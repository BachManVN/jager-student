package com.jager.student.controller;

import com.jager.student.entity.StudentInfoEntity;
import com.jager.student.reporsitory.StudentInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoService {

    @Autowired
    private StudentInfoRepo studentInfoRepo;

    public List<StudentInfoEntity> getAllStudentInfo(){
        return studentInfoRepo.findAll();
    }
}
