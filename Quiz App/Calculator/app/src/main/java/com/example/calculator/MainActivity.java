package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView screenTxt;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDot;
    Button OpAdd, OpSub, OpDiv, OpMul, opSqrt, OpClearAll, opPercentage, opEqual;

    Integer input1, input2;
    String result = "";
    String finalResult = "";
    String operation = "";
    boolean isOperationApplied = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screenTxt = findViewById(R.id.screenTxt);
//            input Btns
        btn0 = findViewById(R.id.btn00);
        btn0.setOnClickListener(this);
        btn1 = findViewById(R.id.btn01);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btn02);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.btn03);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.btn04);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.btn05);
        btn5.setOnClickListener(this);
        btn6 = findViewById(R.id.btn06);
        btn6.setOnClickListener(this);
        btn7 = findViewById(R.id.btn07);
        btn7.setOnClickListener(this);
        btn8 = findViewById(R.id.btn08);
        btn8.setOnClickListener(this);
        btn9 = findViewById(R.id.btn09);
        btn9.setOnClickListener(this);

//            Operation Btns
        OpAdd = findViewById(R.id.opAdd);
        OpAdd.setOnClickListener(this);
        OpSub = findViewById(R.id.opSub);
        OpSub.setOnClickListener(this);
        OpDiv = findViewById(R.id.opDivid);
        OpDiv.setOnClickListener(this);
        OpMul = findViewById(R.id.opMul);
        OpMul.setOnClickListener(this);
        opSqrt = findViewById(R.id.opSqrt);
        opSqrt.setOnClickListener(this);
        OpClearAll = findViewById(R.id.clearTxt);
        OpClearAll.setOnClickListener(this);
        opPercentage = findViewById(R.id.opPercentage);
        opPercentage.setOnClickListener(this);
        opEqual = findViewById(R.id.opEqual);
        opEqual.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        Button clickedButton = (Button) view;
        if (clickedButton.getId() == R.id.btn00) {
            performOperation(0);
        } else if (clickedButton.getId() == R.id.btn01) {
            performOperation(1);
        } else if (clickedButton.getId() == R.id.btn02) {
            performOperation(2);
        } else if (clickedButton.getId() == R.id.btn03) {
            performOperation(3);
        } else if (clickedButton.getId() == R.id.btn04) {
            performOperation(4);
        } else if (clickedButton.getId() == R.id.btn05) {
            performOperation(5);
        } else if (clickedButton.getId() == R.id.btn06) {
            performOperation(6);
        } else if (clickedButton.getId() == R.id.btn07) {
            performOperation(7);
        } else if (clickedButton.getId() == R.id.btn08) {
            performOperation(8);
        } else if (clickedButton.getId() == R.id.btn09) {
            performOperation(9);
        }else if (clickedButton.getId() == R.id.opAdd) {


            if(input2 != null && isOperationApplied){
                doSum();
                operation = "add";
            }else{
                isOperationApplied = true;
                result = "" ;
            }
        }


        if (clickedButton.getId() == R.id.clearTxt) {
            result = " ";
            isOperationApplied = false;
            finalResult = "";
        }
        finalResult = result;

        screenTxt.setText(finalResult);


    }

    void performOperation(int value) {
        if(isOperationApplied){
            input2 = value ;
        }else{
            input1 = value ;
        }
        result += String.valueOf(value);

    }


    public void doSum() {

        // get the input numbers
        if ((input2 !=null) && isOperationApplied) {
            result = String.valueOf(input1 + input2);
            input1 =Integer.valueOf(result);
            input2 = null;
            screenTxt.setText(result);
        }
        else
        {

            isOperationApplied = true;
            screenTxt.setText("Error Please enter Required Values");
        }

    }
}