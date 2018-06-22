package com.example.nguye.designlogin.Model_User.Model_User;


public class Model_User {
    String userNameDefault , passWordDefault;

    public Model_User(){
        userNameDefault = "tanphat";
        passWordDefault = "123";
    }
    public String getUserName(){
        return userNameDefault;
    }
    public String getPassWord(){
        return passWordDefault;
    }
}
