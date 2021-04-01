public class CatBowl extends AbstractBowl{

    @Override
    public void put(int amount) {
        super.put(amount);
        System.out.printf("Food put for %d \n", amount);
        System.out.println();
    }

    @Override
    public void decrease(int amount)  {
        super.decrease(amount);
    }

}
