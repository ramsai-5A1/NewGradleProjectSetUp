package LLDSanketSingh.Chapter4_LiskovSubstitution_Principle.ProblematicCode;

public class VisaCard extends CreditCard {

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
}
