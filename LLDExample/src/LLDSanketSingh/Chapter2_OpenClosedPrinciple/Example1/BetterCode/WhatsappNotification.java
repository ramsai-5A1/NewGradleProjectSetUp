package LLDSanketSingh.Chapter2_OpenClosedPrinciple.Example1.BetterCode;

public class WhatsappNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending WhatsApp Notification to User");
    }
}
