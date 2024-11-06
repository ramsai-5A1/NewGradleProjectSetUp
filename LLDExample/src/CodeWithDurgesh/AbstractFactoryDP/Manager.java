package CodeWithDurgesh.AbstractFactoryDP;


public class Manager implements Employee{

    @Override
    public int salary() {
        return 100000;
    }

    @Override
    public String name() {
        return "I am Manager of this team";
    }
    
}
