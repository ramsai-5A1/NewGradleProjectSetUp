package CodeWithDurgesh.AbstractFactoryDP;

public class Client {
    public static void main(String[] args) {
        Employee employee1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
        Employee manager1 = EmployeeFactory.getEmployee(new ManagerDevFactory());

        System.out.println(employee1.name());
        System.out.println(employee2.name());
        System.out.println(manager1.name());



    }
    
}
