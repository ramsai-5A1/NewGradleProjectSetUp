import MyPackage1.Vehicle;

public class First {
    public static void main(String[] args) {
        Vehicle obj1 = new Vehicle(1, "Ram");

        System.out.println("Id is: " + obj1.getId());
        System.out.println("Name is: " + obj1.getName());

        obj1.setId(11);
        obj1.setName("Kumar");

        System.out.println("Id is: " + obj1.getId());
        System.out.println("Name is: " + obj1.getName());

        Vehicle obj2 = new Vehicle();

        System.out.println("Id is: " + obj2.getId());
        System.out.println("Name is: " + obj2.getName());

    }
}