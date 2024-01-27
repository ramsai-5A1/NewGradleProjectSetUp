
public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Economics");
        subjects.add("Business trends");
        subjects.add("Subject 3");
        this.setSubjects(subjects);
        return this;
    }
}