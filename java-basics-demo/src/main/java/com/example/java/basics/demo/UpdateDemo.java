package com.example.java.basics.demo;

import com.example.java.basics.demo.Entities.Student;

public class UpdateDemo {
    Student student = new Student(" 101","A", " Ahmed ");
   /* public static void main(String[] args){
        String currentName = "Ebtisam";
        String newName = "Ibtisam";
        boolean status = false;

        System.out.println("Current student name: " + currentName);
        if (!currentName.equalsIgnoreCase(newName)){
            currentName = newName;
            status=true;
            System.out.println("Updated Successfully");

        }else {
           status = false;
            System.out.println("Existing value already matches the new value");

        }

        System.out.println("The student name: " + currentName + "Status: " + status);
    }*/

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
