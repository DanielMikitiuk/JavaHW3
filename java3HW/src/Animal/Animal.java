package Animal;

public abstract class Animal {
    private  String nameOfAnimal;
    private  int weight;
    Animal(String nameOfAnimal, int weight){
        this.nameOfAnimal = nameOfAnimal;
        if(weight > 1) {
            this.weight = weight;
        }else{
            this.weight = 2;
        }
    }
    public void setNameOfAnimal(String name){
        this.nameOfAnimal = name;
    }

    public void setWeight(int weight) {
        if(weight > 0 && weight < 200000) {
            this.weight = weight;
        }
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public int getWeight() {
        return weight;
    }


}
