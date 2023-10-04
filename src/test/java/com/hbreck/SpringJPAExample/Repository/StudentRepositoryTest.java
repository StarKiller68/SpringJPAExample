package com.hbreck.SpringJPAExample.Repository;


import com.hbreck.SpringJPAExample.Entity.Guardian;
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

        Guardian guardian = Guardian.builder()
                .name("Evie Dean")
                .email("evieD@gmail.com")
                .mobile("219-466-0969")
                .build();

        Student student = Student.builder()
                .emailId("hbreck@gmail.com")
                .firstName("Herman")
                .lastName("Breckenridge")
                .guardian(guardian)
                .build();
        studentRepository.save(student);

    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()
                .name("Evie Dean")
                .email("evieD@gmail.com")
                .mobile("219-466-0969")
                .build();

        Student student = Student.builder()
                .firstName("Eric")
                .lastName("Breckenridge")
                .emailId("ericB@gmail.co")
                .guardian(guardian)
                .build();

        studentRepository.save(student);

    }

    @Test
    public void printStudentByFirstName(){

        List<Student> students = studentRepository.findByFirstName("Herman");

        System.out.println("Students: " + students);

    }

    @Test
    public void printStudentByFirstNameContaining(){

        List<Student> students = studentRepository.findByFirstNameContaining("Her");

        System.out.println("Students: " + students);

    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("StudentList = " + studentList);
    }
}