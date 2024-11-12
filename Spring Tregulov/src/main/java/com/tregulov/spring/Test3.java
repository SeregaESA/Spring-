package com.tregulov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Pet pet = new Cat();
//        Persen persen = new Persen(pet);

        Persen persen = context.getBean("myPerson", Persen.class);
        persen.callYorPet();

        System.out.println(persen.getSurname());
        System.out.println(persen.getAge());

        context.close();
    }
}
