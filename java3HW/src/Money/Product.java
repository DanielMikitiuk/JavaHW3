package Money;

public class Product extends Money {

    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public Money getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public void DecreasePrice(int percentage) {
        this.price.setMoney((price.getMoney() * 100 + price.getCoins()) * ((100 - percentage)) / 100);
    }

    public Product geProduct() {
        return new Product(getName(), getPrice());
    }

}
