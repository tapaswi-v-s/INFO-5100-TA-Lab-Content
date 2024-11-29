/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design_patterns;

/**
 *
 * @author tapas
 */

interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an email notification");
    }
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}

class NotificationFactory {
    public static Notification createNotification(String type) {
        if ("EMAIL".equalsIgnoreCase(type)) return new EmailNotification();
        else if ("SMS".equalsIgnoreCase(type)) return new SMSNotification();
        
        return null;
    }
}

public class NotificationService_Factory {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("EMAIL");
        
        if (notification != null) notification.notifyUser();
        
        notification = NotificationFactory.createNotification("SMS");
        
        if (notification != null) notification.notifyUser();
        
    }
}
