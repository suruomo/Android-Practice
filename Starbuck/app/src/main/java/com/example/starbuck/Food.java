package com.example.starbuck;

public class Food {
    private String name;
    private String ingredients;
    private int imageResourceId;


    public static final Food[] food={
            new Food("Southwest Veggie Wrap","Salsa Tortilla,Cooked Potatoes,Salsa ,Whipped Cream Cheese",R.drawable.southwest_veggie_wrap),
            new Food("Double-Smoked Bacon, Cheddar & Egg Sandwich","Croissant ,Fried Egg Patty,Sharp Cheddar Cheese",R.drawable.double_smoked_bacon),
            new Food("Classic Oatmeal","TOatmeal [Water, Whole Grain Oatmeal (Whole Grain Rolled Oats, Whole Grain Steel Cut Oats, Whole Grain Oat Flour, Salt, Calcium Carbonate, Guar Gum)]",R.drawable.classic_oatmeal)
    };

    public Food(String name, String ingredients, int imageResourceId) {
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
