package com.tregulov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Pet pet = context.getBean("myPet", Pet.class);

//        Pet pet = new Cat();
        Persen persen = new Persen(pet);
        persen.callYorPet();

        context.close();
    }
}
