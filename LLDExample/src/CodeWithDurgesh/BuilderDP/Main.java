package CodeWithDurgesh.BuilderDP;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = Employee.getBuilder().setId(101).setJavaMarks(91).setName("Arjun").build();
        System.out.println(employee1);

        Employee employee2 = Employee.getBuilder().setId(102).setJavaMarks(81).setName("Hari").build();
        System.out.println(employee2);

        Employee employee3 = Employee.getBuilder().setId(103).setJavaMarks(41).setName("Venkatesh").build();
        System.out.println(employee3);
    }
    
}
