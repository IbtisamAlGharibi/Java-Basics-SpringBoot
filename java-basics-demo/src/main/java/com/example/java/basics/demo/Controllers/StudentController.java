package com.example.java.basics.demo.Controllers;

import com.example.java.basics.demo.Entities.Student;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    Student student = new Student(" 101","A", " Ahmed ");

    @PutMapping("/updateStudent")
    public String updateStudent(@RequestParam String newStudentName){
        String currentName = student.getStudentName();
        student.setStudentName(newStudentName);

        return  "Previous Name: " + currentName+ "New Name: " + student.getStudentName();
    }

}
