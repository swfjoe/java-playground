package com.galvanize.Fruit;

public class Fruit {
    private String size;
    private String type;
    private String color;

    public Fruit(String size, String type, String color) {
        this.size = size;
        this.type = type;
        this.color = color;
    }

    //getters and setters
    public String getSize() {
        return size;
    }

    public void setSize(String Size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
