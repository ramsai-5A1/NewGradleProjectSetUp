package CodeWithDurgesh.IteratorDP.Practice;

public class Student {

    private String name;
    private String collegeName;
    
    public Student(String name, String collegeName) {
        this.name = name;
        this.collegeName = collegeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", collegeName=" + collegeName + "]";
    }
}
