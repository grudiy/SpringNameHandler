package com.grudiy.namehandler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        while (true) {
            ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
            Greater greater = context.getBean(Greater.class);
            greater.sayHello();
        }

    }
}
