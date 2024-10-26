package LLDSanketSingh.Chapter3_AbstractClassesAndInterfaces;

public class AsusLaptop extends Product {
    @Override
    double getPrice() {
        return 0;
    }

    @Override
    void printName() {
        System.out.println("Asus laptop");
    }
}
