package org.example.Bai6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountManagement {
    private List<Account> accounts = new ArrayList<>();

    @Autowired
    @Qualifier("VIP")
    private Notification vipNotify;

    @Autowired
    @Qualifier("Normal")
    private Notification normalNotify;

    public AccountManagement() {
        accounts.add(new Account("an", 3000));
        accounts.add(new Account("binh", 10000));
    }

    public void checkYourBalance(String username, String area) {


        if (username == null || username.isEmpty()) {
            System.out.println("Username không hợp lệ!");
            return;
        }


        Account found = null;
        for (Account acc : accounts) {
            if (acc.getUsername().equals(username)) {
                found = acc;
                break;
            }
        }

        if (found == null) {
            System.out.println("Không tìm thấy tài khoản!");
            return;
        }


        if (found.getBalance() < 0) {
            System.out.println("Tài khoản lỗi (âm tiền)");
            return;
        }


        if (found.getBalance() < 5000) {

            if ("VIP".equalsIgnoreCase(area)) {
                vipNotify.notifyUSer(username, found.getBalance());
            } else {
                normalNotify.notifyUSer(username, found.getBalance());
            }

        } else {
            System.out.println("Tài khoản đủ tiền");
        }
    }

}
