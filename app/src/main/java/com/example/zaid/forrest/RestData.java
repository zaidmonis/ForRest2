package com.example.zaid.forrest;

import java.util.ArrayList;

/**
 * Created by zaid on 10/10/18.
 */

public class RestData {
    boolean success;
    String error;
    ArrayList<NewData> data;

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

    public ArrayList<NewData> getData() {
        return data;
    }

    public void setData(ArrayList<NewData> data) {
        this.data = data;
    }
}
