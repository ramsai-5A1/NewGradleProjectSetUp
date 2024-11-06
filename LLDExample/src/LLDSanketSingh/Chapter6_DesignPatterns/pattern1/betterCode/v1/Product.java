package LLDSanketSingh.Chapter6_DesignPatterns.pattern1.betterCode.v1;

public class Product {
    String id;
    String name;
    int price;
    String type;

    public Product() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "ID:" + this.id + " ,Name: " + this.name + " ,Price: " + this.price + " ,Type: " + this.type;
    }
}
