package com.grudiy.namehandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NameProcessor {
    private NameReader nameRead;

    @Autowired
    public NameProcessor(NameReader name) {
        this.nameRead = name;
    }

    public String process(){ //capitalize Name
        return nameRead.getName().toUpperCase();
    }
}
