package LLDSanketSingh.Chapter2.Example1.BetterCode;

public class SmsNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending SMS Notification to User");
    }
}
