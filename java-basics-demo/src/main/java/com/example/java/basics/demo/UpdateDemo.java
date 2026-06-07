package com.example.java.basics.demo;

public class UpdateDemo {
    public static void main(String[] args){
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
    }
}
