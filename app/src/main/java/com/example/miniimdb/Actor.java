package com.example.miniimdb;

public class Actor {

    private String name;
    private int imageResId;

    public Actor(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}