package CodeWithDurgesh.AbstractFactoryDP;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }
    
}
