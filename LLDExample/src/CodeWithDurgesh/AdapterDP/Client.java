package CodeWithDurgesh.AdapterDP;

public class Client {

    public static void main(String[] args) {
        // Iphone13 iphone13 = new Iphone13(new LightningCable());
        // iphone13.chargeIphone();

        // RealMe realMe = new RealMe(new TypeCCharger());
        // realMe.chargePhone();

        AppleCharger charger = new AdaptorCharger(new TypeCCharger());
        Iphone13 iphone13 = new Iphone13(charger);
        iphone13.chargeIphone();
    }
    
}
