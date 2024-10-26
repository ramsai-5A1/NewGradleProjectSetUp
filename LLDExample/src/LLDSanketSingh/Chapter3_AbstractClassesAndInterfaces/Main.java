package LLDSanketSingh.Chapter3_AbstractClassesAndInterfaces;

interface A {

    default void printData() {
        System.out.println("A printData()");
    }
}

interface B {

    default void printData() {
        System.out.println("B printData()");
    }
}

class C implements A, B {

    @Override
    public void printData() {
        System.out.println("C printData()");
        B.super.printData();
        A.super.printData();
    }
}

public class Main {

    public static void main(String[] args) {

        C obj = new C();
        obj.printData();
//        Product macbook = new Macbook();
//        macbook.printName();
//        macbook.termsAndConditions();
//
//        Product asusLaptop = new AsusLaptop();
//        asusLaptop.printName();

//            Vehicle vehicle = new Benz();
//            vehicle.printPrice();
//            vehicle.printBrandName();
//            vehicle.termsAndConditions();
    }
}
