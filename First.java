import MyPackage1.Vehicle;
import MyPackage1.Admin;
import MyPackage1.SBIImpl;

public class First {
    

    public static void main(String[] args) {
        // Vehicle obj1 = new Vehicle(1, "Ram");

        // System.out.println("Id is: " + obj1.getId());
        // System.out.println("Name is: " + obj1.getName());

        // obj1.setId(11);
        // obj1.setName("Kumar");

        // System.out.println("Id is: " + obj1.getId());
        // System.out.println("Name is: " + obj1.getName());

        // Vehicle obj2 = new Vehicle();

        // System.out.println("Id is: " + obj2.getId());
        // System.out.println("Namee is: " + obj2.getName());

        // Admin obj3 = new Admin();
        // obj3.readData();
        // obj3.writeData();

        // SBIImpl obj4 = new SBIImpl();
        // obj4.addAccountNumber();
        // obj4.getBalance();

        System.out.println("Hello");
        printMessage();
        First obj = new First();
        obj.printAge();
    }

    static void printMessage() {
        System.out.println("Printed from static function");
        First obj = new First();
        obj.printLunch();
    }

    void printAge() {
        System.out.println("My age is 55");
        printLunch();
    }

    void printLunch() {
        System.out.println("I ate lunch");
    }
}