package org.example.Dao;

import org.example.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class OrderDao {
    private List<Order> orderList=new ArrayList<>(Arrays.asList());

    public List<Order> getOrderList(){
        return orderList;
    }
    public boolean addOrder(Order order){
        int size=orderList.size();
        orderList.add(order);
        return orderList.size()>size;
    }
}
