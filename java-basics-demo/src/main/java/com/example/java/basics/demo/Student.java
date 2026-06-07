package com.example.java.basics.demo;

public class Student {
    private String  studentID;
    private String studentName;
    private String  grade;

    public Student(String studentID, String grade, String studentName) {
        this.studentID = studentID;
        this.grade = grade;
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String  getGrade() {
        return grade;
    }

    public void setGrade(String  grade) {
        this.grade = grade;
    }

}
