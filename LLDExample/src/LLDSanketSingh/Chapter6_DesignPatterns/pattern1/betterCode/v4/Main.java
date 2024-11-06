package LLDSanketSingh.Chapter6_DesignPatterns.pattern1.betterCode.v4;

public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                            .setName("Iphone")
                            .setType("Electronics")
                            .setId("12")
                            .setPrice(125000)
                            .build();
        System.out.println(p);


    }
}
