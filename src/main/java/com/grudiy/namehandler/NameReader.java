package com.grudiy.namehandler;

import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class NameReader {

    public String getName(){
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
