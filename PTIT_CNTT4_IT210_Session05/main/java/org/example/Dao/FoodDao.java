package org.example.Dao;

import org.example.model.Dish;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class FoodDao {
    private List<Dish> dishList = new ArrayList<>(Arrays.asList(
            new Dish(1, "bun bo hue", true),
            new Dish(2, "pho bo", true),
            new Dish(3, "com tam", false),
            new Dish(4, "banh mi", true),
            new Dish(5, "hu tieu", true),
            new Dish(6, "mi quang", false),
            new Dish(7, "bun cha", true),
            new Dish(8, "banh xeo", true),
            new Dish(9, "goi cuon", false),
            new Dish(10, "bun rieu", true)
    ));
    public List<Dish> getDishList(){
        return dishList;
    }
}
