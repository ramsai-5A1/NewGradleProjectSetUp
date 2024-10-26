package LLDSanketSingh.Chapter3_AbstractClassesAndInterfaces;

public class Macbook extends Product {
    @Override
    double getPrice() {
        return 0;
    }

    @Override
    void printName() {
        System.out.println("Macbook air");
    }

//    @Override
//    public void termsAndConditions() {
//        System.out.println("Terms & Conditions of Macbook");
//    }
}
