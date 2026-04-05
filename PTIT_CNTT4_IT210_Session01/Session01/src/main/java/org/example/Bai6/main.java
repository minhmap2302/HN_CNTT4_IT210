package org.example.Bai6;

import org.example.Bai6.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        AccountManagement accountManagement=context.getBean(AccountManagement.class);
        accountManagement.checkYourBalance("an","VIP");
        accountManagement.checkYourBalance("binh", "Normal");
    }
}
