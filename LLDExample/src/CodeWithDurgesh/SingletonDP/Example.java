package CodeWithDurgesh.SingletonDP;

import java.lang.reflect.Constructor;

public class Example {

    public static void main(String[] args) throws Exception {
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        // Samosa samosa2 = Samosa.getSamosa();
        // System.out.println(samosa2.hashCode());

        // Using Reflection API, we were able to break the singleton 
        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa samosa2 = constructor.newInstance();
        System.out.println(samosa2.hashCode());
    }
    
}


/*
 * 
 * 
 * 
 * 
 * 
 */
