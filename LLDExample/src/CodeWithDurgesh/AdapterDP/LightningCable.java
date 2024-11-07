package CodeWithDurgesh.AdapterDP;

public class LightningCable implements AppleCharger {

    @Override
    public void chargePhone() {
        System.out.println("Charge completed for Iphone-13 using Lightning cable");
    }
}
