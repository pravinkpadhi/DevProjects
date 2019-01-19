package com.example.hello.firsthello.controller;

import com.example.hello.firsthello.entity.Student;
import com.example.hello.firsthello.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student){
      log.debug("Started StudentController.saveStudent()");
        return studentService.saveStudent(student);
    }

    @GetMapping("/getStudent/{id1}")
    public List<Student> getStudent(@RequestParam("id") Long id, @PathVariable("id1") Long id1){
        log.debug("Started StudentController.getStudent()");
        List<Student> students = studentService.getStudent(id);
        return students;
    }
}
