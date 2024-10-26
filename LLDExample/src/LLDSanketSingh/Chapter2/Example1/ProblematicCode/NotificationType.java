package LLDSanketSingh.Chapter2.Example1.ProblematicCode;

public enum NotificationType {

    SMS,
    WHATSAPP,
    EMAIL;

    public void sentSmsNotification() {
        System.out.println("Sending SMS notification to user");
    }

    public void sendWhatsappNotification() {
        System.out.println("Sending Whatsapp Notification to user");
    }

    public void sendEmailNotification() {
        System.out.println("Sending Email Notification to user");
    }

}
