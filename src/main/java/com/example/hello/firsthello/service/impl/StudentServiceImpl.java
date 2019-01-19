package com.example.hello.firsthello.service.impl;

import com.example.hello.firsthello.entity.Student;
import com.example.hello.firsthello.repository.StudentRepository;
import com.example.hello.firsthello.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        log.debug("Student record to be saved : {}", student);
        Student savedStudentRecord = studentRepository.save(student);
        log.debug("Saved student record: {}", savedStudentRecord);
        return savedStudentRecord;
    }

    @Override
    public List<Student> getStudent(Long id) {
        Student student = new Student();
        List<Student> students = new ArrayList<>();
         if(Objects.isNull(id)){
            log.debug("Fetching all records: ");
             students = studentRepository.findAll();
             return students;
        }
        log.debug("Fetching student record by Id: ", id);
        Optional<Student> optionalStudent = studentRepository.findById(id);
         students.add(optionalStudent.isPresent() ? optionalStudent.stream().findFirst().get() : new Student());
         log.debug("Student : {}", students);
        return students;
    }
}
