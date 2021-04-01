public abstract class AbstractBowl {
    protected int amount;
    public void put(int amount) {
        this.amount += amount;
    }
    public void decrease(int amount) {
        this.amount -= amount;
    }


}
