package com.project.studentMangment;

import com.project.studentMangment.entity.Student;
import com.project.studentMangment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentManagementSystemApplication implements  CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student tempStudent1 = new Student("Parbati", "Gosavi", "parbati@gmail.com");
//		studentRepository.save(tempStudent1);
//
//		Student tempStudent2 = new Student("Samiksha", "Jagtap", "samiksha@gmail.com");
//		studentRepository.save(tempStudent2);
//
//		Student tempStudent3 = new Student("Yaksh", "Gosavi", "yaksh@gmail.com");
//		studentRepository.save(tempStudent3);
	}
}
