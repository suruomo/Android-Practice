package com.example.bitsandpizzas;

public class Store {
    private String name;
    private String description;
    private int imageResourceId;


    public static final Store[] stores={
            new Store("store1","The first store",R.drawable.store1),
            new Store("store2","The second store",R.drawable.store2)
    };

    public Store(String name, String description, int imageResourceId) {
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
