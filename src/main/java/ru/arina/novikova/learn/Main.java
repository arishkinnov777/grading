package ru.arina.novikova.learn;
public class Main {
    public static void main(String[] args) {
      Notification emailNotification = new EmailNotification();
      Notification smsNotification = new SmsNotification(emailNotification);
      Notification messengerlNotification = new MessengerlNotification(smsNotification);
      sendNotification(messengerlNotification);
    }

    private static void sendNotification(Notification notification) {
        notification.send();
    }
}