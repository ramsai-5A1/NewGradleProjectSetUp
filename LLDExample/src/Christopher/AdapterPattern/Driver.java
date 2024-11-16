package Christopher.AdapterPattern;

public class Driver {
    public static void main(String[] args) {
        IAdaptee adaptee = new Adaptee();
        IAdapter adapter = new Adapter(adaptee);
        adapter.request();
    }
}
