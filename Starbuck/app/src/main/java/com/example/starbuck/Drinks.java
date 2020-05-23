package com.example.starbuck;

public class Drinks {
    private String name;
    private String ingredients;
    private int imageResourceId;


    public static final Drinks[] drinks={
            new Drinks("Caffè Americano","Water, Brewed Espresso",R.drawable.caffe_americano),
            new Drinks("Caffè Misto","Brewed Coffee, Milk",R.drawable.caffe_misto),
            new Drinks("Cappuccino","Milk, Brewed Espresso",R.drawable.cappuccino),
            new Drinks("Espresso","Brewed Espresso",R.drawable.espresso),
            new Drinks("Almondmilk Honey Flat White","Almondmilk, Brewed Espresso, Honey Blend",R.drawable.almondmilk_honey_flat_white)
    };

    public Drinks(String name, String ingredients, int imageResourceId) {
        this.name = name;
        this.ingredients = ingredients;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }
}
