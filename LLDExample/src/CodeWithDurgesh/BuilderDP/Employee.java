package CodeWithDurgesh.BuilderDP;

public class Employee {

    private int id;
    private String name;
    private int javaMarks;

    private Employee(EmployeeBuilder builderObj) {
        this.id = builderObj.getId();
        this.name = builderObj.getName();
        this.javaMarks = builderObj.getJavaMarks();
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", Name: " + this.name + ", Java Marks: " + this.javaMarks;
    }



    public static class EmployeeBuilder {
        
        private int id;
        private String name;
        private int javaMarks;

        public EmployeeBuilder() {

        }

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setJavaMarks(int javaMarks) {
            this.javaMarks = javaMarks;
            return this;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public int getJavaMarks() {
            return this.javaMarks;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
