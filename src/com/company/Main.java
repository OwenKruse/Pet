package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        pet dog = new pet("Smiley", "Pitbull", LocalDate.of(2016, Month.JANUARY, 1), pet.typeOfAnimal.dog);
	// write your code here
        System.out.println(dog.getName());
        System.out.println(dog.isNeedsRestraint());
        pet cat = new pet(pet.typeOfAnimal.cat);

    }


}
