import java.util.List;

public class PushNotification implements Notification {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending Push Notification to " + recipient + ": " + message);
    }

    public void sendBulkNotification(List<String> recipients, String message) {
        for (String recipient : recipients) {
            send(recipient, message);
        }
    }
}