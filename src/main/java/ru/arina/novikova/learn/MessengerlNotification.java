package ru.arina.novikova.learn;

public class MessengerlNotification implements Notification {
    private Notification notification;
    public MessengerlNotification() {
    }
    public MessengerlNotification(Notification notification) {
        this.notification = notification;
    }
    @Override
    public void send() {
        if (notification != null) {
            notification.send();
        }
        System.out.println("Сообщение отправлено в приложение");
    }
}

