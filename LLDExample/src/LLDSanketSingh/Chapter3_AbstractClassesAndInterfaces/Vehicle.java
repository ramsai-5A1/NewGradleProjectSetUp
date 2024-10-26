package LLDSanketSingh.Chapter3_AbstractClassesAndInterfaces;

public interface Vehicle {

    void printPrice();

    void printBrandName();

    public default void termsAndConditions() {
        System.out.println("Printing Terms & Conditions");
    }
}
