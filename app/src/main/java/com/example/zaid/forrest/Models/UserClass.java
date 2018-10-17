package com.example.zaid.forrest.Models;

/**
 * Created by zaid on 11/10/18.
 */


public class UserClass {
    int id;
    int start_year;

    public UserClass(int id, int start_year, int role, int active, String name, String roll, String mobile, String bio, String status, String section, String profile_url, String created_at, String updated_at, String device) {
        this.id = id;
        this.start_year = start_year;
        this.role = role;
        this.active = active;
        this.name = name;
        this.roll = roll;
        this.mobile = mobile;
        this.bio = bio;
        this.status = status;
        this.section = section;
        this.profile_url = profile_url;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.device = device;
    }
    public UserClass(){

    }

    int role;
    int active;
    String name, roll, mobile, bio, status, section, profile_url, created_at, updated_at, device;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStart_year() {
        return start_year;
    }

    public void setStart_year(int start_year) {
        this.start_year = start_year;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getProfile_url() {
        return profile_url;
    }

    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
