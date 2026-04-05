package org.example.Bai3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
        OrderFoodService service=context.getBean(OrderFoodService.class);
        service.orderFood("An","My Tom",20000);
    }
}
