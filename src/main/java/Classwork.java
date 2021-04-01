public class Classwork {
    public static int am;
    public static void main(String[] args){
        Cat c = new Cat("Barsik", 14,true);
        Cat c1 = new Cat("Murzik", 15,true);
        AbstractBowl[] bowls = {
                new CatBowl()
        };
        for (AbstractBowl bowl : bowls) {
            am = 14;
            bowl.put(am);
            c.eat(bowl);
            c1.eat(bowl);
        }
    }
}
