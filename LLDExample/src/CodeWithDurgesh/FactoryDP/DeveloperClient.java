package CodeWithDurgesh.FactoryDP;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee1 = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(employee1.salary());
        Employee employee2 = EmployeeFactory.getEmployee("Web Developer");
        System.out.println(employee2.salary());
        // System.out.println("Hello Java world");

    }
}




