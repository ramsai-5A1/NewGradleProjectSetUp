package LLDSanketSingh.Chapter5_ISP.problematicCode;

public class Seller implements User {
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
