package com.example.java.basics.demo.Entities;

public class Student {
    private String  studentId;
    private String studentName;
    private String  grade;

    public Student(String studentId, String grade, String studentName) {
        this.studentId = studentId;
        this.grade = grade;
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentId;
    }

    public void setStudentID(String studentID) {
        this.studentId = studentID;
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
