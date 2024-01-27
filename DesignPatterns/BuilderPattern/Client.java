
public class Client {
    public static void main(String[] args) {
        Director object1 = new Director(new EngineeringStudentBuilder());
        Director object2 = new Director(new MBAStudentBuilder());

        Student engineerStudent = object1.createEngineeringStudent();
        Student mbaStudent = object2.createMBAStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}