package com.example.zaid.forrest.Models;

/**
 * Created by zaid on 15/10/18.
 */

public class User {
    public String userName;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
