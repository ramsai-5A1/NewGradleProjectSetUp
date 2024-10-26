package LLDSanketSingh.Chapter2.Example5.BetterCode;

import java.util.Date;

public class Truck implements Vehicle {

    String vehicleType = "Truck";
    @Override
    public String getVehicleType() {
        return this.vehicleType;
    }

    @Override
    public InsurenceBox getInsurenceInformation() {
        return new InsurenceBox(1, new Date(2025, 10, 26));
    }
}
