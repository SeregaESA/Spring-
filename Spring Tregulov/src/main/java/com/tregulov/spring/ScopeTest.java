package com.tregulov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();

//        Dog yorDog = context.getBean("dog", Dog.class);
//
//        System.out.println(myDog==yorDog);

        context.close();

    }
}
