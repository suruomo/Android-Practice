package com.example.bitsandpizzas;

public class Pizza {
    private String name;
    private String description;
    private int imageResourceId;


    public static final Pizza[] pizzas={
            new Pizza("pizza1","The first pizza",R.drawable.),
            new Pizza("pizza2","The second pizza",R.drawable.pizza2),
            new Pizza("pizza3","The third pizza",R.drawable.pizza3)
    };

    public Pizza(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}
