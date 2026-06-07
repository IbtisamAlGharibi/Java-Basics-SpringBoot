package com.example.java.basics.demo;

public class UpdateDemo {
    String currentStudent;
    String newStudent;
    String status;

    public UpdateDemo(String currentStudent, String newStudent, String status) {
        this.currentStudent = currentStudent;
        this.newStudent = newStudent;
        this.status = status;
    }

    public String getCurrentStudent() {
        return currentStudent;
    }

    public void setCurrentStudent(String currentStudent) {
        this.currentStudent = currentStudent;
    }

    public String getNewStudent() {
        return newStudent;
    }

    public void setNewStudent(String newStudent) {
        this.newStudent = newStudent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
