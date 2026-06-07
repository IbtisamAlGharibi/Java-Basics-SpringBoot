package com.example.java.basics.demo;

public class StudentController {
    Student student = new Student(" 101","A", " Ahmed ");

    public void displayInfo(){
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " +student.getStudentName());
        System.out.println("Student Grade: " + student.getGrade());
    }

}
