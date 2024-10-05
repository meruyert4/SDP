import java.util.List;

public class NotificationService {
    private final Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void sendBulkNotification(List<String> recipients, String message) {
        for (String recipient : recipients) {
            notification.send(recipient, message);
        }
    }
}