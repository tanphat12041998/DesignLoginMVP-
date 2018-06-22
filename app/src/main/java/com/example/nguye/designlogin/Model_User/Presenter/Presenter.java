package com.example.nguye.designlogin.Model_User.Presenter;

import com.example.nguye.designlogin.Model_User.Model_User.Model_User;
import com.example.nguye.designlogin.Model_User.View.MainActivity;
import com.example.nguye.designlogin.Model_User.View.MainView;

public class Presenter{
    private MainView view;
    private Model_User model_user;

    public Presenter(MainActivity view){
        this.view = view;
        model_user = new Model_User();
    }

    public void CheckLogin(String userName, String passWord){
        if(userName.isEmpty() || !userName.equals(model_user.getUserName()))
            view.LoginFail();
        else if (!passWord.equals(model_user.getPassWord()) || passWord.isEmpty())
            view.LoginFail();
        else
            view.LoginSuccess();
    }
}
