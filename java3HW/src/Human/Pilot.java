package Human;

public class Pilot extends Human{

    public Pilot(String name, int age) {
        super(name, age);
    }

    public String work(){
        return "I am " + getName() + ", i work as a pilot";
    }
}
