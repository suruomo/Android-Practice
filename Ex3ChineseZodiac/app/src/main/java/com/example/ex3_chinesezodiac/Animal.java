package com.example.ex3_chinesezodiac;

public class Animal {
    private String name;
    private String personality;
    private int imageResourceId;

    public static final Animal[] animals={
            new Animal("rat","Quick-witted,smart,charming,sharp",R.drawable.rat),
            new Animal("ox","Goal-oriented,hardworking,conserative",R.drawable.ox),
            new Animal("tiger","Authoritative,strong,leader,emotional",R.drawable.tiger),
            new Animal("rabbit","Popular,compassionate,possible",R.drawable.ribbat),
            new Animal("dragon","Enegeric,fearless,warm-hearted",R.drawable.dragon),
            new Animal("snake","Charming,gregarious,good,analytical",R.drawable.snake),
            new Animal("horse","Energetic,impatiet,self-reliant",R.drawable.horse),
            new Animal("goat","Creative thinkers,mild-mannered,shy,kind",R.drawable.goat),
            new Animal("monkey","Fun,upbeat,active,energetic,good",R.drawable.monkey),
            new Animal("rooster","Independent,practical,industrious",R.drawable.rooster),
            new Animal("dog","Patient,loyal,diligent,kind",R.drawable.dog),
            new Animal("pig","Lving,intelligent,tolerant,perfectionist",R.drawable.pig)
    };

    public Animal(String name, String personality, int imageResourceId) {
        this.name = name;
        this.personality = personality;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getPersonality() {
        return personality;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
