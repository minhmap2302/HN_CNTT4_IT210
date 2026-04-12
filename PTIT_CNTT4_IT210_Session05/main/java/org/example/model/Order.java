package org.example.model;

public class Order {
    private int id;
    private int userid;
    private double total_price;

    public Order() {
    }

    public Order(int id, int userid, double total_price) {
        this.id = id;
        this.userid = userid;
        this.total_price = total_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }
}
