package LLDSanketSingh.Chapter2_OpenClosedPrinciple.Example1.BetterCode;

public class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Email Notification to User");
    }
}
