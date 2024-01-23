
public class Mushroom extends ToppingDecorator {
    BasePizza basePizza;

    public Mushroom(basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}