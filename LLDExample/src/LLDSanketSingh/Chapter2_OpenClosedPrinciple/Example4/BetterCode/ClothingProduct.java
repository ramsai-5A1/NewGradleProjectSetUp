package LLDSanketSingh.Chapter2_OpenClosedPrinciple.Example4.BetterCode;

public class ClothingProduct implements Product {
    double price = 10.0;

    @Override
    public double getDiscount() {
        return this.price * 0.20;
    }

    @Override
    public String getType() {
        return "CLOTHING";
    }
}
