package com.example.session02.Bai4.model.entity;

public class Event {
    private int id;
    private String name;
    private String date;
    private int price;
    private int remainingTickets;

    public Event(int id, String name, String date, int price, int remainingTickets) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
        this.remainingTickets = remainingTickets;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDate() { return date; }
    public int getPrice() { return price; }
    public int getRemainingTickets() { return remainingTickets; }

}