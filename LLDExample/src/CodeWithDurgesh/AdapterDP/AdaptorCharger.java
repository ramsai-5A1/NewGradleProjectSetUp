package CodeWithDurgesh.AdapterDP;

public class AdaptorCharger implements AppleCharger {

    private AndroidCharger charger;

    public AdaptorCharger(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhone() {
        charger.chargeAndroidPhone();
        System.out.println("Your phone is charging with Adaptor");
    }
    
}
