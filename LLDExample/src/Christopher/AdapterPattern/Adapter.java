package Christopher.AdapterPattern;

public class Adapter implements IAdapter {

    IAdaptee adaptee;

    public Adapter(IAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specialRequest();
    }
}
