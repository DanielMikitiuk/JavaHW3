package Money;

public class Money {
    private long money;
    private int coins;

    public Money(long money, int coins) {
        this.money = money;
        this.coins = coins;
    }

    public Money() {
    }

    public void setMoney(long newSuma) {
        this.money = newSuma;
    }

    public void setCoins(int newSumaCoins) {
        this.coins = newSumaCoins;
    }

    public long getMoney() {
        return this.money += (long) (coins / 100);
    }

    public int getCoins() {
        return this.coins;
    }

    public void Print() {
        System.out.println("Money on balance: " + Long.toString(getMoney()));
    }

    @Override
    public String toString() {
        return Long.toString(getMoney());
    }

}
