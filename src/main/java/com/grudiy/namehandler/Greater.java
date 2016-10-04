package com.grudiy.namehandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greater {
    private NameReader nameRead;
    private NameProcessor nameProcessor;

    @Autowired
    public Greater(NameReader name, NameProcessor nameprocessor) {
        this.nameRead = name;
        this.nameProcessor = nameprocessor;
    }

    public void sayHello(){
        System.out.println("Hello " + nameProcessor.process(nameRead.getName()));
    }
}
