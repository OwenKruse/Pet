package com.company;

import java.time.LocalDate;
import java.time.Period;

public class pet{
    private String name;
    private String breed;
    private typeOfAnimal type;
    private LocalDate birthDate;
    private boolean needsRestraint;
    public enum typeOfAnimal {
        cat,
        dog,
        chicken,
    }




    public pet(String name, String breed, LocalDate birthDate, pet.typeOfAnimal typeOfAnimal) {
        this.name = name;
        this.breed = breed;
        this.birthDate = birthDate;
        this.type = typeOfAnimal;




    }
    public pet(pet.typeOfAnimal typeOfAnimal) {

    }

    public String getType() {
        return type.toString();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }



    public int getAge() {
        LocalDate today = LocalDate.now();
        // Period between today and birthdate
        Period period = Period.between(birthDate, today);
        return period.getYears();



    }
    public boolean isNeedsRestraint() {

        return getAge() < 13;
    }


    public void setNeedsRestraint(boolean needsRestraint) {
        this.needsRestraint = needsRestraint;
    }

    public String toString() {
        return "pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", birthDate=" + birthDate +
                ", needsRestraint=" + needsRestraint +
                '}';
    }

}





