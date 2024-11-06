package CodeWithDurgesh.AbstractFactoryDP;

public class WebDevFactory extends EmployeeAbstractFactory {

    @Override
    Employee createEmployee() {
        return new WebDeveloper();
    }
    
}
