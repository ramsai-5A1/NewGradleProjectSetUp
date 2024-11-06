package CodeWithDurgesh.AbstractFactoryDP;

public class AndroidDevFactory extends EmployeeAbstractFactory {

    @Override
    Employee createEmployee() {
        return new AndroidDeveloper();
    }
    
}
