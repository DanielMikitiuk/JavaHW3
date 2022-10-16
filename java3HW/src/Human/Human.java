package Human;

public abstract class Human {
    private  String name;
    private  int age;
    public Human(String name, int age){
        this.name = name;
        if(age > 0 && age < 120){
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        if(age > 0 && age < 120){
            this.age = age;
        }
    }


}
