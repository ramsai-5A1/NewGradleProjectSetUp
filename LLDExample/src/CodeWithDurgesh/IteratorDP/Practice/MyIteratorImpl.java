package CodeWithDurgesh.IteratorDP.Practice;

import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<Student> studentsList;
    private int length;
    private int position = 0;

    public MyIteratorImpl(List<Student> studentsList) {
        this.studentsList = studentsList;
        length = studentsList.size();
    }

    @Override
    public boolean hasNext() {
        return position < length ? true : false;
    }

    @Override
    public Object next() {
        return studentsList.get(position++);
    }
    
}
