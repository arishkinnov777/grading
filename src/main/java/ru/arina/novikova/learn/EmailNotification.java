package ru.arina.novikova.learn;

public class EmailNotification implements Notification {
    private Notification notification;
    public EmailNotification() {
    }
    public EmailNotification(Notification notification) {
        this.notification = notification;
    }
    @Override
    public void send() {
        if (notification != null) {
            notification.send();
        }
        System.out.println("Сообщение отправлено на Email");
    }
}

