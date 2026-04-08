package com.example.Bai1.entity;

public class food {
    private int id;
    private String name;
    private Double price;

    public food(int id,String name, Double price) {
        this.id=id;
        this.name = name;
        this.price = price;
    }
    public food() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
