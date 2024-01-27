
public class Student {
    int rollNumber;
    int age;
    String fatherName;
    String motherName;
    String name;
    List<String> subjects;

    Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.name = builder.name;
        this.subjects = builder.subjects;
    }

    public String toString() {
        return "Roll number: " + this.rollNumber + " Age: " + this.age + " Name: " + this.name +
        " Father name: " + this.fatherName + " Mother name: " + this.motherName + " Subjects: " + this.subjects.get(0) + " , " + this.subjects.get(1) +
        " , " + this.subjects.get(2);
    }
}