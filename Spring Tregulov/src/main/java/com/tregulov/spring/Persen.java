package com.tregulov.spring;

public class Persen {

    private Pet pet;

    public Persen(Pet pet) {
        this.pet = pet;
    }

    public void callYorPet () {
        System.out.println("Привет, мой питомец");
        pet.say();
    }

}
