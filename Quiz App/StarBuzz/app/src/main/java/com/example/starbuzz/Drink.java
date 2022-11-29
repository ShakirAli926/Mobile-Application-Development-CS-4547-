package com.example.starbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourseId;

    public static final Drink[] drinks = {
            new Drink("Latte","A Couple of expresso shots with steamed milk",R.drawable.latte),
            new Drink("Cappuccino","A Couple of expresso shots with steamed milk",R.drawable.cappuccino),
            new Drink("Filter","A Couple of expresso shots with steamed milk",R.drawable.filter)
    };

    private Drink(String name, String description,int imageResourseId){
        this.name= name;
        this.description= description;
        this.imageResourseId= imageResourseId;

    }

    public String getName(){
        return  name;
    }

    public String getDescription(){
        return  description;
    }

    public int getImageResourseId(){
        return  imageResourseId;
    }

    public  String toString(){
        return this.name;
    }

}
