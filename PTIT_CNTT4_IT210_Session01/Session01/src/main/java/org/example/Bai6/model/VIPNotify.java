package org.example.Bai6.model;

import org.example.Bai6.Notification;
import org.springframework.stereotype.Component;

@Component("VIP")
public class VIPNotify implements Notification {

    @Override
    public void notifyUSer(String username, double balance) {
        System.out.println("[POPUP] User: " + username + " sắp hết tiền!");
        System.out.println("Số dư còn lại: " + balance);
    }
}
