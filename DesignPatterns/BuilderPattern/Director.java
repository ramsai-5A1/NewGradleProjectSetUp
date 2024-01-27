
public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceOf EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceOf MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1).setName("Krishna").setAge(25).setSubjects().build();
    } 

    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(1).setName("Rama").setAge(18).setFatherName("Laxman").setMotherName("Aruna").setSubjects().build();
    }
}