package com.example.shakir;

public class ColorSelection {

    String choiceMethod (String selectedColor){
        String choices ="";
        switch (selectedColor) {
            case "Red":
                choices =  String.valueOf(selectedColor) + " => Rooz Afza, Jam-e-Shirin ";
                break;
            case "Blue":
                choices =  String.valueOf(selectedColor) + " => BlueBerry fresh Juice";
                break;
            case "Green":
                choices = String.valueOf(selectedColor) + " => Mint Margarita, Dew Cold Drink";
                break;
        }

        return choices;
    }
}
