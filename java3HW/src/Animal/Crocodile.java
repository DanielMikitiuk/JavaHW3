package Animal;

public class Crocodile extends Animal{
    public Crocodile(String nameOfAnimal, int weight) {
        super(nameOfAnimal,weight);
    }
    public String WhatKindOfAnimal(){
        return "I'm crocodile";
    }
    public String getInfo(){

        return "\nCrocodile:" + getNameOfAnimal() + "\nweight:" + getWeight();
    }
}
