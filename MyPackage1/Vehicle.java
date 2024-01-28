package MyPackage1;

public class Vehicle {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle() {
        this.id = -1;
        this.name = "Temporary name";
    }

    public Vehicle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDetails() {
        System.out.println("Id is: " + id + " Name is: " + name);
    }
}