package LLDSanketSingh.Chapter5_ISP.BetterCode;

public class Seller implements ISellProduct, IModifyProduct, IBuyProduct{
    @Override
    public boolean buy() {
        return false;
    }

    @Override
    public boolean modify() {
        return false;
    }

    @Override
    public boolean sell() {
        return false;
    }
}
