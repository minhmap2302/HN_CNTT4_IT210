package org.example.Dao;


import org.example.model.OrderDeltail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class OrderDetailDao {
    private List<OrderDeltail> orderDeltailList = new ArrayList<>();
    public List<OrderDeltail> getOrderList(){
        return orderDeltailList;
    }
    public boolean addOrder(OrderDeltail order){
        int size=orderDeltailList.size();
        orderDeltailList.add(order);
        return orderDeltailList.size()>size;
    }
}
