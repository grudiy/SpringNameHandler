package com.grudiy.namehandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greater {
    private User user;
    private NameProcessor nameProcessor;

    @Autowired
    public Greater(User user, NameProcessor nameProcessor) {
        this.user = user;
        this.nameProcessor = nameProcessor;
    }

    public void sayHello(){
        System.out.println("Hello " + nameProcessor.capitalize(user.getName()));
    }
}
