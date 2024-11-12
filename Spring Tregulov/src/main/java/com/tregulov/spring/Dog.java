package com.tregulov.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class Dog implements Pet {

//    private String name;

    public Dog() {
        System.out.println("Собака");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @PostConstruct
    public void init() {
        System.out.println("Dog: init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Dog: destroy");
    }

    @Override
    public void say() {
        System.out.println("Гав-гав");
    }
}
