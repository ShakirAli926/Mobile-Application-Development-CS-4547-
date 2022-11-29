package com.example.shakir;

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

    public void btnFindBeer(View view) {
        TextView resultsTxt = (TextView) findViewById(R.id.resultsTxt);
        Spinner spinnerInput = (Spinner) findViewById(R.id.spinner);
        Button btnClick = (Button) findViewById(R.id.button);
        String selectedColor = spinnerInput.getSelectedItem().toString();

        ColorSelection choiceObj = new ColorSelection();
        String ChoicesColor = choiceObj.choiceMethod(selectedColor);
        resultsTxt.setText(ChoicesColor);

    }
}