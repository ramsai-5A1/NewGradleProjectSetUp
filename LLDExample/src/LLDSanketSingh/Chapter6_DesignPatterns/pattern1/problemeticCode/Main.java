package LLDSanketSingh.Chapter6_DesignPatterns.pattern1.problemeticCode;

import LLDSanketSingh.Chapter6_DesignPatterns.pattern1.problemeticCode.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("1", "IPhone", 120000, "Electronics");
        Product product2 = new Product("2", "Macbook Air", 80000, "Electronics");
        Product product3 = new Product("3", "Telivision", 30000, "Electronics");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
