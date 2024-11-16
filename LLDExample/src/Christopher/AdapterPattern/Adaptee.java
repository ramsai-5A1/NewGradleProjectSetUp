package Christopher.AdapterPattern;

public class Adaptee implements IAdaptee {

    @Override
    public void specialRequest() {
        System.out.println("Special Request invoked");
    }

}
