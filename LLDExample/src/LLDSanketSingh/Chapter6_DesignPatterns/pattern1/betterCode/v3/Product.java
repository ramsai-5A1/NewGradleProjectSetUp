package LLDSanketSingh.Chapter6_DesignPatterns.pattern1.betterCode.v3;

public class Product {
    String id;
    String name;
    int price;
    String type;
    public Product(Builder b) {
        if (b.getPrice() > 0) {
            this.price = b.getPrice();
        }

        this.name = b.getName();
    }
}
