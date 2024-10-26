package LLDSanketSingh.Chapter3_AbstractClassesAndInterfaces;

public class Benz implements Vehicle {
    @Override
    public void printPrice() {
        System.out.println("Price is 80,00,000");
    }

    @Override
    public void printBrandName() {
        System.out.println("Brand: Benz");
    }

    @Override
    public void termsAndConditions() {
        System.out.println("Benz Terms & Conditions");
    }
}
