package com.example.java.basics.demo;

public class Student {
    private String  studentID;
    private String studentName;
    private int grade;

    public Student(String studentID, int grade, String studentName) {
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    Student student = new Student("01",95, "Ibtisam");

}
