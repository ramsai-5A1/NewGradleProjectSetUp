
public class Extracheese extends ToppingDecorator {
    BasePizza basePizza;

    public Extracheese(basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    publit int cost() {
        return this.basePizza.cost() + 10;
    }
}