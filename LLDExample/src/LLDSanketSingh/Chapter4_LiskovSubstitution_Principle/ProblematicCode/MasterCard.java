package LLDSanketSingh.Chapter4_LiskovSubstitution_Principle.ProblematicCode;

public class MasterCard extends CreditCard {

    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay implementation of MasterCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay implementation of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online-Transfer implementation of MasterCard");
    }

    @Override
    public void mandataryPayments() {
        System.out.println("MandatoryPayments implementation of MasterCard");
    }
}
