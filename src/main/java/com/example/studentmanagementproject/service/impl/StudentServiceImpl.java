package com.example.studentmanagementproject.service.impl;

import com.example.studentmanagementproject.entity.Student;
import com.example.studentmanagementproject.repository.StudentRepo;
import com.example.studentmanagementproject.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student studentByID(Long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public void deleteStudentByID(Long id) {
        studentRepo.deleteById(id);

    }
}
