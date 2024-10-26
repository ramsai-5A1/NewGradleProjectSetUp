package LLDSanketSingh.Chapter2.Example4.BetterCode;

public class ElectronicProduct implements Product {
    double price = 8.0;

    @Override
    public double getDiscount() {
        return this.price * 0.1;
    }

    @Override
    public String getType() {
        return "ELECTRONICS";
    }
}
