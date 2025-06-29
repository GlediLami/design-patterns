package org.sda.factory.notification;

public class NotificationFactory {

    public static Notification getNotification(NotificationType type){
        switch (type){
            case SMS: return new SmsNotification();
            case PUSH: return new PushNotification();
            case EMAIL: return new EmailNotification();
            default: throw new IllegalArgumentException("Invalid notification type");
        }
    }

}
