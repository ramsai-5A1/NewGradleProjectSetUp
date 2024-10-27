package LLDSanketSingh.Chapter4_LiskovSubstitution_Principle.BetterCode;

import LLDSanketSingh.Chapter4_LiskovSubstitution_Principle.ProblematicCode.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InternationalPaymentCompatibleCreditCard> cards = new ArrayList<>();
        for (InternationalPaymentCompatibleCreditCard card: cards) {
            card.internationalPayment();
        }
    }
}
