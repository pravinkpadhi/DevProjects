package com.example.hello.firsthello.service;

import com.example.hello.firsthello.entity.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getStudent(Long id);
}
