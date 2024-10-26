package LLDSanketSingh.Chapter3_AbstractClassesAndInterfaces;

abstract class Product {
    int price;
    abstract double getPrice();

    abstract void printName();

    void termsAndConditions() {
        System.out.println("Default Terms & Conditions");
    }
}
