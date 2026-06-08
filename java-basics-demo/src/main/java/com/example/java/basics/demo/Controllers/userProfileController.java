package com.example.java.basics.demo.Controllers;

import com.example.java.basics.demo.Entities.UserProfile;

public class userProfileController {
    static UserProfile userProfile = new UserProfile("1001","0712345678", "Muscat, Oman");

    public String displayInfo(){
        return "User Id: "+ userProfile.getUserId() +
                "phone Number: " + userProfile.getPhoneNumber()+
                "Address: " + userProfile.getAddress();
    }

    public String updateUserProfile(String phone,String address){
        userProfile.setPhoneNumber(phone);
        userProfile.setAddress(address);
        return "User Id: "+ userProfile.getUserId() +
                "phone Number: " + userProfile.getPhoneNumber()+
                "Address: " + userProfile.getAddress()+
                "Two fields updated successfully";
    }
}
