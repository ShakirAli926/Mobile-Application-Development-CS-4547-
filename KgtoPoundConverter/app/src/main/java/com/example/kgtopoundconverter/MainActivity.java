package com.example.kgtopoundconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        TextView resultText = findViewById(R.id.textView) ;
        EditText inputTxt = findViewById(R.id.editTextTextPersonName);
        String value = inputTxt.getText().toString();
        if (TextUtils.isEmpty(value)) {
            resultText.setText("Please enter the Value.");
            return;
        } else{
            int kg = Integer.parseInt(value);
            double pound = 2.205 * kg;
            resultText.setText("The corresponding value of in Pounds is : "+ pound);
        }
    }
}