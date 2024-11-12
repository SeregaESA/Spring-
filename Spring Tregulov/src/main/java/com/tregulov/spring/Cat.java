package com.tregulov.spring;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {


    public Cat() {
        System.out.println("Cat");
    }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}
