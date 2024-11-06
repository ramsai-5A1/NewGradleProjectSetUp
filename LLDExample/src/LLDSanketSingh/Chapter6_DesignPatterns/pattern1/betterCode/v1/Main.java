package LLDSanketSingh.Chapter6_DesignPatterns.pattern1.betterCode.v1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println(product1);

        product1.setId("11");
        System.out.println(product1);

        product1.setName("Iphone");
        System.out.println(product1);

        product1.setPrice(120000);
        System.out.println(product1);
    }
}
