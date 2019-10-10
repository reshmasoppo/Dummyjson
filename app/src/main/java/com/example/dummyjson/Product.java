package com.example.dummyjson;

public class Product {

    private int id;
    private String name;
    private String city;
    private int image;

    public Product(int id, String name, String city ,int image) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getcity() {
        return city;
    }

    public int getImage() {
        return image;
    }
}