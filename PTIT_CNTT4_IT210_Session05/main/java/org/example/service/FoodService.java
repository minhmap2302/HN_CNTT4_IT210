package org.example.service;

import org.example.Dao.FoodDao;
import org.example.model.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    private final FoodDao foodDao;
    @Autowired
    public FoodService(FoodDao foodDao) {
        this.foodDao = foodDao;
    }
    public List<Dish> getalldish(){
        return foodDao.getDishList();
    }

}
