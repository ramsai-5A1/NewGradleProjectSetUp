package LLDSanketSingh.Chapter5_ISP_DIP.problematicCode;

public class Buyer implements User {
    @Override
    public boolean canBuyProduct() {
        return false;
    }

    @Override
    public boolean canModifyProduct() {
        return false;
    }

    @Override
    public boolean canAddProduct() {
        return false;
    }

    @Override
    public boolean canApproveProduct() {
        return false;
    }
}
