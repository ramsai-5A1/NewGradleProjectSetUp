package CodeWithDurgesh.SingletonDP;

// import java.lang.reflect.Constructor;

public class Example {

    public static void main(String[] args) throws Exception {
        Samosa samosa1 = Samosa.INSTANCE;
        System.out.println(samosa1.hashCode());
        samosa1.test();

        Samosa samosa2 = Samosa.INSTANCE;
        System.out.println(samosa2.hashCode());
        samosa2.test();

        Samosa samosa3 = Samosa.INSTANCE;
        System.out.println(samosa3.hashCode());
        samosa3.test();


        // Samosa samosa2 = Samosa.getSamosa();
        // System.out.println(samosa2.hashCode());

        // Using Reflection API, we were able to break the singleton 
        // Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Samosa samosa2 = constructor.newInstance();
        // System.out.println(samosa2.hashCode());
    }
    
}


/*
 * 
 * 
 * 
 * 
 * 
 */
