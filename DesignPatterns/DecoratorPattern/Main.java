
public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Mushroom(new Extracheese(new Vegdelight()));
        System.out.println(basePizza.cost());
    }
}