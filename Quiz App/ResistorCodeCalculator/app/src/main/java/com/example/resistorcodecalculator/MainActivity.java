package com.example.resistorcodecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView resultTxt;
    Spinner bandFirstColor, bandSecondColor,bandThirdColor, bandMultiplierColor, bandToleranceColor, bandTemperature;

    String firstTwoDigit = "";
    double multiplier;
    String tolerance = "";
    String tempCo = "";
    String finalResult = "";

    public void onClickCheck(View view) {
        resultTxt = findViewById(R.id.result);
        bandFirstColor = findViewById(R.id.spinnerFirstBandColor);
        bandSecondColor = findViewById(R.id.spinnerSecondBandColor);
        bandThirdColor = findViewById(R.id.spinnerThirdBandColor);
        bandMultiplierColor = findViewById(R.id.spinnerMultiplierBandColor);
        bandToleranceColor = findViewById(R.id.spinnerToleranceBandColor);
        bandTemperature = findViewById(R.id.spinnerTemCoefficientBandColor);

        String Selected1stBand = bandFirstColor.getSelectedItem().toString();
        String Selected2ndBand = bandSecondColor.getSelectedItem().toString();
        String Selected3rdBand = bandThirdColor.getSelectedItem().toString();
        String SelectedMultiplierBand = bandMultiplierColor.getSelectedItem().toString();
        String SelectedToleranceBand = bandToleranceColor.getSelectedItem().toString();
        String SelectedTempBand = bandTemperature.getSelectedItem().toString();

        getColorValue(Selected1stBand);
        getColorValue(Selected2ndBand);
        getColorValue(Selected3rdBand);
        getMultiplierValue(SelectedMultiplierBand);
        getToleranceValue(SelectedToleranceBand);
        getTempValue(SelectedTempBand);

        getResult();

        resultTxt.setText(finalResult);
    }


    void getColorValue(String color) {

        switch (color) {
            case "Black": {
                firstTwoDigit += "0";

            }
            break;
            case "Brown": {
                firstTwoDigit += "1";
            }
            break;
            case "Red": {
                firstTwoDigit += "2";

            }
            break;
            case "Orange": {
                firstTwoDigit += "3";
            }
            break;
            case "Yellow": {
                firstTwoDigit += "4";
            }
            break;
            case "Green": {
                firstTwoDigit += "5";
            }
            break;
            case "Blue": {
                firstTwoDigit += "6";
            }
            break;
            case "Violet": {
                firstTwoDigit += "7";
            }
            break;
            case "Gray": {
                firstTwoDigit += "8";
            }
            break;
            case "White": {
                firstTwoDigit += "9";
            }
            break;

        }

    }
    void getMultiplierValue(String color) {

        switch (color) {
            case "Black": {
                multiplier = 1;

            }
            break;
            case "Brown": {
                multiplier = 10;
            }
            break;
            case "Red": {
                multiplier = 100;

            }
            break;
            case "Orange": {
                multiplier = 1000;
            }
            break;
            case "Yellow": {
                multiplier = 10000;
            }
            break;
            case "Green": {
                multiplier = 100000;
            }
            break;
            case "Blue": {
                multiplier = 1000000;
            }
            break;
            case "Gold": {
                multiplier = 0.1;
            }
            break;
            case "Silver": {
                multiplier = 0.01;
            }
            break;
        }

    }
    void getTempValue(String color) {

        switch (color) {
            case "Black": {
                tempCo += "250 ppm/K";
            }
            break;
            case "Brown": {
                tempCo += "100 ppm/K";
            }
            break;
            case "Red": {
                tempCo += "50 ppm/K";

            }
            break;
            case "Orange": {
                tempCo += "15 ppm/K";
            }
            break;
            case "Yellow": {
                tempCo += "25 ppm/K";
            }
            break;
            case "Green": {
                tempCo += "20 ppm/K";
            }
            break;
            case "Blue": {
                tempCo += "10 ppm/K";
            }
            break;
            case "Violet": {
                tempCo += "5 ppm/K";
            }
            break;
            case "Grey": {
                tempCo += "1 ppm/K";
            }
            break;
        }

    }
    void getToleranceValue(String color) {

        switch (color) {
            case "Brown": {
                tolerance += "±1% ";
            }
            break;
            case "Red": {
                tolerance += "±2% ";

            }
            break;
          case "Green": {
              tolerance += "±0.5% ";
            }
            break;
            case "Blue": {
                tolerance += "± 0.25%";
            }
            break;
            case "Violet": {
                tolerance += "±0.1%";
            }
            break;
            case "Gold": {
                tolerance += "±5% ";
            }
            break;
            case "Silver": {
                tolerance += "±10%";
            }
            break;
        }

    }
    void getResult(){
        finalResult = String.valueOf((Integer.valueOf(firstTwoDigit)*multiplier)/1000 + "KΩ " + tolerance +" (C) " +  tempCo +" (M)") ;
    }
}