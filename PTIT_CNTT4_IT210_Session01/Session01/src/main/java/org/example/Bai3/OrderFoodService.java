package org.example.Bai3;

public class OrderFoodService {
    private IsAvalilable isAvalilable;
    private UserAccount userAccount;

    public OrderFoodService(IsAvalilable isAvalilable, UserAccount userAccount) {
        this.isAvalilable = isAvalilable;
        this.userAccount = userAccount;
    }
    public void orderFood(String user, String food, double price) {
        if (isAvalilable.isAvailable(food)) {
            userAccount.deductMoney(user, price);
            System.out.println("Order thành công: " + food);
        } else {
            System.out.println("Hết hàng");
        }
    }
}
