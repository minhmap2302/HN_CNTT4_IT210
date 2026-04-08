package com.example.Bai1.reposity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.Bai1.entity.food;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersReposity {
    private List<food> foods= new ArrayList<>(Arrays.asList(
            new food(1, "pho bo", 40000.0),
            new food(2, "pho ga", 35000.0)
    ));
    public List<food> getAllOrders() {

        return foods;

    }

    public food getOrderById(int id) {

        return foods.stream().filter(e->e.getId()==id).findFirst().orElse(null);
    }
    public void addfood(food f){
        foods.add(f);
    }
}
