package com.example.lab3_chinesezodiac;

public class Animal {
    private String name;
    private int imageResourceId;

    public static final Animal[] animals={
            new Animal("rat",R.drawable.rat),
            new Animal("ox",R.drawable.ox),
            new Animal("tiger",R.drawable.tiger),
            new Animal("rabbit",R.drawable.rabbit),
            new Animal("dragon",R.drawable.dragon),
            new Animal("snake",R.drawable.snake),
            new Animal("horse",R.drawable.horse),
            new Animal("goat",R.drawable.goat),
            new Animal("monkey",R.drawable.monkey),
            new Animal("rooster",R.drawable.rooster),
            new Animal("dog",R.drawable.dog),
            new Animal("pig",R.drawable.pig)
    };

    public Animal(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
