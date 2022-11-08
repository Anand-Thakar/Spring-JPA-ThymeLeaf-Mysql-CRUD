package com.example.studentmanagementproject.service;

import com.example.studentmanagementproject.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student saveStudent(Student student);

    Student updateStudent(Student student);

    Student studentByID(Long id);

    void deleteStudentByID(Long id);
}
