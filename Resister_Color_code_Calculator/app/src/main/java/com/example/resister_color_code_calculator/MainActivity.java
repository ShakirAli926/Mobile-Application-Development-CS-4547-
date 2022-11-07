package com.example.resister_color_code_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String bandsCode = "" ;
    double  multiplierResult ;
    double  tolerance ;
    double  results  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickCalculate(View view) {

        TextView result = findViewById(R.id.result);
        Spinner bandOneColor = findViewById(R.id.spinnerBand1Color);
        Spinner bandTwoColor = findViewById(R.id.spinnerBand2);
        Spinner multiplierColor = findViewById(R.id.spinnerMultiplier);
        Spinner toleranceColor = findViewById(R.id.spinnerTolerance);


        String bandOne = bandOneColor.getSelectedItem().toString();
        String bandTwo = bandTwoColor.getSelectedItem().toString();
        String multiplier = multiplierColor.getSelectedItem().toString();
        String toleranceValue = toleranceColor.getSelectedItem().toString();

        getBandValues(bandOne);
        getBandValues(bandTwo);
        getMultiplierValues(multiplier);
        getToleranceValues(toleranceValue);

        getResistance(multiplierResult,toleranceValue);

        result.setText(bandsCode);

        bandsCode = "";

    }

   void getBandValues(String color){

        switch (color){
            case  "Black": {
                bandsCode += "0";
            }
            break;
            case  "Brown": {
                bandsCode += "1";
            }
            break;
            case  "Red": {
                bandsCode += "2";
            }
            break;
            case  "Orange": {
                bandsCode += "3";
            }
            break;
            case  "Yellow": {
                bandsCode += "4";
            }
            break;
            case  "Green": {
                bandsCode += "5";
            }
            break;
            case  "Blue": {
                bandsCode += "6";
            }
            break;
            case  "Violet": {
                bandsCode += "7";
            }
            break;
            case  "Grey": {
                bandsCode += "8";
            }
            break;
            case "White": {
                bandsCode += "9";
            }
            break;


        }
    }

    void getMultiplierValues(String color){

        switch (color){
            case  "Black": {
                multiplierResult = 1;
            }
            break;
            case  "Brown": {
                multiplierResult = 10;
            }
            break;
            case  "Red": {
                multiplierResult = 100;
            }
            break;
            case  "Orange": {
                multiplierResult = 1000;
            }
            break;
            case  "Yellow": {
                multiplierResult = 10000;
            }
            break;
            case  "Green": {
                multiplierResult = 100000;
            }
            break;
            case  "Blue": {
                multiplierResult = 1000000;
            }
            break;
            case  "Violet": {
                multiplierResult = 10000000;
            }
            break;
            case  "Grey": {
                multiplierResult = 100000000;
            }
            break;
            case "White": {
                multiplierResult = 1000000000;
            }
            break;
            case "Gold": {
                multiplierResult = 0.1;
            }
            break;
            case "Silver": {
                multiplierResult = 0.01;
            }
            break;


        }
    }

    void getToleranceValues(String color){

        switch (color){
            case  "Brown": {
                tolerance = 1;
            }
            break;
            case  "Red": {
                tolerance = 2;
            }
            break;
            case  "Green": {
                tolerance = 0.5;
            }
            break;
            case  "Blue": {
                tolerance = 0.25;
            }
            break;
            case  "Violet": {
                tolerance = 0.1;
            }
            break;
            case  "Grey": {
                tolerance = 0.05;
            }
            break;
            case "Gold": {
                tolerance = 5;
            }
            break;
            case "Silver": {
                tolerance = 10;
            }
            break;


        }
    }


    void getResistance(double multiplier, String toleranceValue){

        results = Integer.parseInt(bandsCode) * multiplier;
        bandsCode = "Resistor Value of the Given Code is \n " + results/1000 + "k Ohms "+ tolerance+"%";
    }
}