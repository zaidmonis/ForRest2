package com.example.zaid.forrest;

/**
 * Created by zaid on 10/10/18.
 */

public class NewData {
    String name;
    int id;

    public NewData(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
