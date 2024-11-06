package CodeWithDurgesh.SingletonDP;

public class Jalebi {

    // Eager way of creating object
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi() {
        return jalebi;
    }
    
}
