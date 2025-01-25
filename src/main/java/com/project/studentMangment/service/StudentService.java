package com.project.studentMangment.service;

import com.project.studentMangment.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student saveStudent(Student student);

    Student updateStudent(Student student);

    Student getStudentById(Long id);

    void deleteById(Long id);

}
