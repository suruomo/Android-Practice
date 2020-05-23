package com.example.starbuck;

public class AtHomeCoffee {
    private String name;
    private String description;
    private int imageResourceId;


    public static final AtHomeCoffee[] atHomeCoffees={
            new AtHomeCoffee("Sun-Dried Papua New Guinea Ulya Starbucks Reserve","Notes of baked pineapple and brown sugar with a syrupy mouthfeel and hints of eucalyptus. In this remote place of otherworldly beauty, fortune favors the bold. The result is our first sun-dried coffee from Papua New Guinea, and it's a triumph.",R.drawable.sun_dried),
            new AtHomeCoffee("Jamaica Blue Mountain® Starbucks Reserve®","Named after the mist that casts a blue-tinged glow over Jamaican mountainsides, this coffee is a returning customer favorite, with layers of citrus and a hint of cocoa.",R.drawable.jamaica_blue),
            new AtHomeCoffee("Decaf Sumatra","Full bodied decaf dark roast coffee with a smooth mouthfeel and lingering herbal notes.",R.drawable.decaf_sumatra)
    };

    public AtHomeCoffee(String name, String description, int imageResourceId) {
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
