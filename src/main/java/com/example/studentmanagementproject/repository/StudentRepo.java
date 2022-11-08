package com.example.studentmanagementproject.repository;

import com.example.studentmanagementproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
