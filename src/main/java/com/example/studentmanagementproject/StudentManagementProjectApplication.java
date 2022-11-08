package com.example.studentmanagementproject;

import com.example.studentmanagementproject.entity.Student;
import com.example.studentmanagementproject.repository.StudentRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Data
public class StudentManagementProjectApplication implements  CommandLineRunner {

	private StudentRepo studentRepo;

	public StudentManagementProjectApplication(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementProjectApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Anand","Thakar","007andy@gmail.com");
//		studentRepo.save(student1);
//		Student student2 = new Student("Dhrumit","Thaker","dhrumit@gmail.com");
//		studentRepo.save(student2);
//		Student student3 = new Student("Devang","Thakar","Devang@gmail.com");
//		studentRepo.save(student3);

	}
}
