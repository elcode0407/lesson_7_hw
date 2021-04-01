public class Cat extends CatBowl {
    protected String name;
    protected int appetite;
    protected boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(AbstractBowl bowl) {
        System.out.printf("%s appetite is -> " + appetite + "\n", this.name);
        while (satiety) {
            if (bowl.amount == appetite) {
                System.out.printf("In plate %d\n", bowl.amount);
                bowl.decrease(appetite);
                System.out.printf("%s decreased for %d, and %d left\n", this.name, appetite, bowl.amount);
                System.out.printf("Cat %s ate some food\n", this.name);
                System.out.println("---------------------------------------");
                satiety = false;
            } else if (bowl.amount < appetite) {
                System.out.printf("%s cant`t eat, appetite is very BIG in plate %d!!!\n", this.name, bowl.amount);
                System.out.println("---------------------------------------");
                bowl.amount = bowl.amount + Classwork.am;
            } else {
                System.out.printf("In plate %d\n", bowl.amount);
                bowl.decrease(appetite);
                System.out.printf("%s decreased for %d, and %d left\n", this.name, appetite, bowl.amount);
                System.out.printf("Cat %s ate some food\n", this.name);
                System.out.println("---------------------------------------");
                satiety = false;
            }
        }
    }

    @Override
    public String toString() {

        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
