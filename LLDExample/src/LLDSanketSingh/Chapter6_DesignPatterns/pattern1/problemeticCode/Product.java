package LLDSanketSingh.Chapter6_DesignPatterns.pattern1.problemeticCode;

public class Product {
    String id;
    String name;
    int price;
    String type;

    public Product(String id, String name, int price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "ID:" + this.id + " ,Name: " + this.name + " ,Price: " + this.price + " ,Type: " + this.type;
    }
}
