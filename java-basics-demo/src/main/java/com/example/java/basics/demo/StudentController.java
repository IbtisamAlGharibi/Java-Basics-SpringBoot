package com.example.java.basics.demo;

public class StudentController {
    Student student = new Student(" 101","A", " Ahmed ");

    public void displayInfo(){
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " +student.getStudentName());
        System.out.println("Student Grade: " + student.getGrade());

        student.setStudentName("Ali");
        student.setGrade("B");

        System.out.println("Updated Student Details:");
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Grade: " + student.getGrade());

        System.out.println("Verification:");
        System.out.println("Student ID remains: " + student.getStudentID());
        System.out.println("Student Name updated to: " + student.getStudentName());
        System.out.println("Student Grade updated to: " + student.getGrade());
    }

}
