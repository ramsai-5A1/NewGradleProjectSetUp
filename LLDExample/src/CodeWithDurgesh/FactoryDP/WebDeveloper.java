package CodeWithDurgesh.FactoryDP;

public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Fetching Web-Developer Salary");
        return 40000;
    }
}
