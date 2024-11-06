package CodeWithDurgesh.SingletonDP;

public class Samosa {

    private static Samosa samosa;

    private Samosa() {
        if (samosa != null) {
            throw new RuntimeException("You can't create another object");
        }
        System.out.println("Constructor is getting executed");
    }

    // Lazy way of creating object
    public static Samosa getSamosa() {
        if (samosa == null) {
            synchronized (Samosa.class) {
                samosa = new Samosa();
            }
        }
        return samosa;
    }
    
}
