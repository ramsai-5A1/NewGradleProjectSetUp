package CodeWithDurgesh.IteratorDP;

public class Main {
    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("Arjun", "101"));
        userManagement.addUser(new User("Venky", "102"));
        userManagement.addUser(new User("Hari", "103"));
        userManagement.addUser(new User("Ram", "104"));

        MyIterator iterator = userManagement.getIterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println(user);
        }

    }    
}
