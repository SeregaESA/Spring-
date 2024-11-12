package com.tregulov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Anatation1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context3.xml");

//        Cat cat = context.getBean("catBean", Cat.class);
//        cat.say();

        Persen persen = context.getBean("personBean", Persen.class);
        persen.callYorPet();

        System.out.println(persen.getSurname());
        System.out.println(persen.getAge());

        context.close();
    }
}
