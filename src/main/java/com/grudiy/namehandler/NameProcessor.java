package com.grudiy.namehandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NameProcessor {
    private NameReader nameReader;

    @Autowired
    public NameProcessor(NameReader nameReader) {
        this.nameReader = nameReader;
    }

    public String capitalize(String s){ //capitalize Name
        return s.toUpperCase();
    }
}
