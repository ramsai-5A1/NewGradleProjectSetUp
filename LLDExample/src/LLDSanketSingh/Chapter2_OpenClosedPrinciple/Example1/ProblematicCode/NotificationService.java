package LLDSanketSingh.Chapter2_OpenClosedPrinciple.Example1.ProblematicCode;

import java.util.List;

public class NotificationService {

    public void sendNotifications(List<NotificationType> allNotifications) {
        for (NotificationType type: allNotifications) {
            if (type == NotificationType.SMS) {
                type.sentSmsNotification();
            } else if (type == NotificationType.EMAIL) {
                type.sendEmailNotification();
            } else if (type == NotificationType.WHATSAPP) {
                type.sendWhatsappNotification();
            }
        }
    }
}
