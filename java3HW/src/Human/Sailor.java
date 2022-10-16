package Human;

public class Sailor extends Human{

    public Sailor(String name, int age) {
        super(name, age);
    }
    public String work(){
        return "I am " + getName() + ", i work as a sailor";
    }
}
