package CodeWithDurgesh.IteratorDP;

import java.util.List;

public class MyIteratorImpl implements MyIterator  {

    private List<User> usersList;
    private int length;
    private int position = 0;

    public MyIteratorImpl(List<User> usersList) {
        this.usersList = usersList;
        this.length = usersList.size();
    }

    @Override
    public boolean hasNext() {
        return position < length ? true : false;
    }

    @Override
    public Object next() {
        return usersList.get(position++);
    }
}
