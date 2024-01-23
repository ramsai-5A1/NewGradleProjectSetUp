
public class EmailObserverAlertImpl implements NotificationAlertObserver {

    String emailId;
    StocksObservable observable;

    EmailObserverAlertImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in stock hurry up!!");
    }

    private void sendMail(String emailId, String message) {
        System.out.println("mail sent to " + emailId);
    }
}