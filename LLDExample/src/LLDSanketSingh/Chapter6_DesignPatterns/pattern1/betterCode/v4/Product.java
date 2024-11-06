package LLDSanketSingh.Chapter6_DesignPatterns.pattern1.betterCode.v4;

public class Product {
    String id;
    String name;
    int price;
    String type;
    private Product(Builder b) {
        if (b.getPrice() > 0) {
            this.price = b.getPrice();
        }

        this.name = b.getName();
        this.type = b.getType();
        this.id = b.getId();
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " ,Name: " + this.name + " ,Type: " + this.type + " ,Price: " + this.price;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        String id;
        String name;
        int price;
        String type;

        public Product build() {
            return new Product(this);
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public String getId() {
            return this.id;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getName() {
            return this.name;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public int getPrice() {
            return this.price;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public String getType() {
            return this.type;
        }
    }
}
