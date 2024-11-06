package CodeWithDurgesh.AbstractFactoryDP;

public class ManagerDevFactory extends EmployeeAbstractFactory {

    @Override
    Employee createEmployee() {
        return new Manager();
    }
    
}
