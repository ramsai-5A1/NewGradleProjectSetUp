package CodeWithDurgesh.IteratorDP.Practice;

public class Main {

    public static void main(String[] args) {

        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent(new Student("Vikas", "101"));
        studentManagement.addStudent(new Student("Vishwa", "102"));
        studentManagement.addStudent(new Student("Chandu", "103"));
        studentManagement.addStudent(new Student("Venkat", "104"));
        studentManagement.addStudent(new Student("Ram", "105"));

        MyIterator iterator = studentManagement.getIterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student);
        }
        System.out.println("Completed traversing using iterator");
    }
    
}
