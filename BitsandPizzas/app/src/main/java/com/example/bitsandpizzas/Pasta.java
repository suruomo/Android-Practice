package com.example.bitsandpizzas;

public class Pasta {
    private String name;
    private String description;
    private int imageResourceId;


    public static final Pasta[] pastas={
            new Pasta("pasta1","The first pasta",R.drawable.pasta1),
            new Pasta("pasta2","The second pasta",R.drawable.pasta2),
            new Pasta("pasta3","The third pasta",R.drawable.pasta3)
    };

    public Pasta(String name, String description, int imageResourceId) {
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
