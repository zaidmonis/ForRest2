package com.example.zaid.forrest.Models;

/**
 * Created by zaid on 11/10/18.
 */



public class UserResponse {
    public boolean success;
    String error;
    UserClass data;

    public UserResponse(boolean success, String error, UserClass data) {
        this.success = success;
        this.error = error;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public UserClass getData() {
        return data;
    }

    public void setData(UserClass data) {
        this.data = data;
    }
    public void getUserString(){

    }
}
