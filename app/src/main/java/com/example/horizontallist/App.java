package com.example.horizontallist;

public class App {
    int image;
    String name;
    int size;

    public App(int image, String name, int size) {
        this.image = image;
        this.name = name;
        this.size = size;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
