package com.example.android_buoi3_btvn;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String password;

    public User(String username, String passwprd) {
        this.username = username;
        this.password = passwprd;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String toString(){
        return this.username+this.password+"1111";
    }
}

