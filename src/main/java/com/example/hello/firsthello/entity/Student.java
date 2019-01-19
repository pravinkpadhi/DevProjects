package com.example.hello.firsthello.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@Data
public class Student {

    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;

    @Column(name = "student_name")
    private String studentName;

}
