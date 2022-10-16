package Animal;

public class Tiger extends Animal{
    public Tiger(String nameOfAnimal, int weight) {
        super(nameOfAnimal,weight);
    }
    public String WhatKindOfAnimal(){
        return "I'm tiger";
    }
    public String getInfo(){

        return "\nTiger:" + getNameOfAnimal() + "\nweight:" + getWeight();
    }
}
