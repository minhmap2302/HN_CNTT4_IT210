package org.example.Bai5.Model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SystemConfig {
    @Value("Cyber Game Hà Nội")
    private String branchName;
    @Value("08:00 AM")
    private String openingHour;
    public void showInfo() {
        System.out.println("Chi nhánh: " + branchName);
        System.out.println("Giờ mở cửa: " + openingHour);
    }
}
