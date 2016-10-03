package com.grudiy.namehandler;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private String name;

    @Autowired
    public void setName (NameReader nameReader){
        this.name = nameReader.read();
    }

    public String getName() {
        return name;
    }
}