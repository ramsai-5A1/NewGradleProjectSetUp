package CodeWithDurgesh.AdapterDP;

public class RealMe {

    private AndroidCharger androidCharger;

    public RealMe(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    public void chargePhone() {
        androidCharger.chargeAndroidPhone();
    }
    
}
