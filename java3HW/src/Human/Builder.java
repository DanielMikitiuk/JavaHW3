package Human;

public class Builder extends Human{

    public Builder(String name, int age) {
        super(name, age);
    }
    public String work(){
        return "I am " + getName() + ", i work as a builder";
    }
}
