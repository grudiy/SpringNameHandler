package com.grudiy.namehandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greater {
    private NameProcessor nameProcessor;

    @Autowired
    public Greater(NameProcessor nameprocessor) {
        this.nameProcessor = nameprocessor;
    }

    public void sayHello(){
        System.out.println("Hello " + nameProcessor.process());
    }
}
