package com.example.java.basics.demo;

public class UpdateEmailDemo {
    String currentEmail = "ahmed@example.com ";
    String newEmail = "ali@example.com ";
    boolean  status = false;

    public String updateEmail(){
        System.out.println("current Email: " + currentEmail);
        if (!currentEmail.equalsIgnoreCase(newEmail)){
            currentEmail = newEmail;
            status =true;
            return "Email updated successfully";
        }
        status = false;
        return "No update required. Email address is already current";
    }


}
