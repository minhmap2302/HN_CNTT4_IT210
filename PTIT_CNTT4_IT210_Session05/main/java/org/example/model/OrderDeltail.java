package org.example.model;

public class OrderDeltail {
    private int id;
    private int orderId;
    private int dishid;

    public OrderDeltail() {
    }

    public OrderDeltail(int id, int dishid,int oderId) {
        this.id = id;
        this.dishid = dishid;
        this.orderId=oderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDishid(int iddish) {
        return dishid;
    }

    public void setDishid(int dishid) {
        this.dishid = dishid;
    }
}
