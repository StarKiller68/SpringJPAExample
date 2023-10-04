package com.hbreck.SpringJPAExample.Repository;


import com.hbreck.SpringJPAExample.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("hbreck@gmail.com")
                .firstName("Herman")
                .lastName("Breckenridge")
                .guardianName("Evie Dean")
                .guardianEmail("evieD@gmail.com")
                .guardianMobile("219-466-0969")
                .build();
        studentRepository.save(student);

    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("StudentList = " + studentList);
    }
}