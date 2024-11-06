package CodeWithDurgesh.PrototypeDP;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Creating object using Prototype Design Pattern");
        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("123.32.432");
        networkConnection.loadImportabtData();
        System.out.println(networkConnection);

        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);

            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection3);

            System.out.println(networkConnection.hashCode());
            System.out.println(networkConnection2.hashCode());
            System.out.println(networkConnection3.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
    
}
