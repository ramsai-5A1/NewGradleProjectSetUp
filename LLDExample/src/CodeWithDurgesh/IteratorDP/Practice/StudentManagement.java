package CodeWithDurgesh.IteratorDP.Practice;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public MyIterator getIterator() {
        return new MyIteratorImpl(students);
    }
    
}
