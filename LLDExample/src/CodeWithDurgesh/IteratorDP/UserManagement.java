package CodeWithDurgesh.IteratorDP;

import java.util.ArrayList;

public class UserManagement {

    private ArrayList<User> usersList = new ArrayList<>();

    public void addUser(User user) {
        usersList.add(user);
    }

    public User getUser(int index) {
        return usersList.get(index);
    }

    public MyIterator getIterator() {
        return new MyIteratorImpl(usersList);
    }
    
}
