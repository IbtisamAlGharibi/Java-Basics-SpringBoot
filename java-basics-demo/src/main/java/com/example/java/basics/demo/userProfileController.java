package com.example.java.basics.demo;

public class userProfileController {
    static UserProfile userProfile = new UserProfile("1001","0712345678", "Muscat, Oman");

    public String displayInfo(){
        return "User Id: "+ userProfile.getUserId() +
                "phone Number: " + userProfile.getPhoneNumber()+
                "Address: " + userProfile.getAddress();
    }
}
