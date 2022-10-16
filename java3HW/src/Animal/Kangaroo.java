package Animal;

public class Kangaroo extends Animal{
    public Kangaroo(String nameOfAnimal, int weight) {
        super(nameOfAnimal,weight);
    }
    public String WhatKindOfAnimal(){
        return "I'm kangaroo";
    }
    public String getInfo(){

        return "\nKangaroo:" + getNameOfAnimal() + "\nweight:" + getWeight();
    }
}
