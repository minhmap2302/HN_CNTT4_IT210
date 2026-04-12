package org.example.service;

import org.example.Dao.OrderDao;
import org.example.Dao.OrderDetailDao;
import org.example.model.Order;
import org.example.model.OrderDeltail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrderService {
    private final OrderDao orderDao;
    private final OrderDetailDao orderDetailDao;
    @Autowired
    public OrderService(OrderDao orderDao, OrderDetailDao orderDetailDao) {
        this.orderDao = orderDao;
        this.orderDetailDao = orderDetailDao;
    }
    public void addOrder(Order order){
        orderDao.addOrder(order);
    }
    public void addOderdetail(int idorder,int iddish){
        OrderDeltail orderDeltail=new OrderDeltail();
        orderDeltail.setId((int) (Math.random()*1000));
        orderDeltail.setOrderId(idorder);
        orderDeltail.setDishid(iddish);
        orderDetailDao.addOrder(orderDeltail);
    }
}
