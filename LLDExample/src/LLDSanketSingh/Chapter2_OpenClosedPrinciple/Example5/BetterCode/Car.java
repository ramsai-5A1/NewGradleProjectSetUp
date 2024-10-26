package LLDSanketSingh.Chapter2_OpenClosedPrinciple.Example5.BetterCode;

import java.util.Date;

public class Car implements Vehicle {

    String vehicleType = "Car";
    @Override
    public String getVehicleType() {
        return this.vehicleType;
    }

    @Override
    public InsurenceBox getInsurenceInformation() {
        return new InsurenceBox(1, new Date(2026, 10, 26));
    }
}
