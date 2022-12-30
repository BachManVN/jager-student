package com.jager.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_info")
public class StudentInfoEntity {
    @Id
    @Column(name ="id")
    Integer id;

    @Column(name ="student_code")
    String studentCode;

    @Column(name ="student_email")
    String studentEmail;

    @Column(name ="student_name")
    String studentName;

}
