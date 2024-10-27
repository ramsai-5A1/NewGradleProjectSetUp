package LLDSanketSingh.Chapter4_LiskovSubstitution_Principle.BetterCode;

public class RuPayCard extends CreditCard implements UpiPaymentCreditCard {

    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay implementation of RuPayCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay implementation of RuPayCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online-Transfer implementation of RuPayCard");
    }

    @Override
    public void mandataryPayments() {
        System.out.println("MandatoryPayments implementation of RuPayCard");
    }

    @Override
    public void upiPayment() {
        System.out.println("Upi-Payment implementation of RuPayCard");
    }
}
