package com.tregulov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("personBean")
public class Persen {

//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;

   // @Autowired
    public Persen(Pet pet) {
        System.out.println("Person");
        this.pet = pet;
    }


    public Persen() {
        System.out.println("Person");
    }

    @Autowired
    @Qualifier ("dog")
    public void setPet( Pet pet) {
        System.out.println("Set");
        this.pet = pet;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void callYorPet () {
        System.out.println("Привет, мой питомец");
        pet.say();
    }

}
