package LLDSanketSingh.Chapter4_LiskovSubstitution_Principle.BetterCode;

public class VisaCard extends CreditCard implements InternationalPaymentCompatibleCreditCard {

    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay implementation of VisaCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay implementation of VisaCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online-Transfer implementation of VisaCard");
    }

    @Override
    public void mandataryPayments() {
        System.out.println("MandatoryPayments implementation of VisaCard");
    }

    @Override
    public void internationalPayment() {
        System.out.println("InternationalPayment implementation of VisaCard");
    }
}
