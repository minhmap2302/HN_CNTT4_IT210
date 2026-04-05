package org.example.Bai3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
    @Bean
    public IsAvalilable isAvalilable(){
        return new IsAvalilable();
    }
    @Bean
    public UserAccount userAccount(){
        return new UserAccount();
    }
    @Bean
    public OrderFoodService orderFoodService(){
        return new OrderFoodService(isAvalilable(),userAccount());
    }

}
