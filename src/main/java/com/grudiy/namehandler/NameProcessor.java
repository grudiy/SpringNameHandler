package com.grudiy.namehandler;

import org.springframework.stereotype.Component;

@Component
public class NameProcessor {

    public String process(String s){ //capitalize Name
        return s.toUpperCase();
    }
}
