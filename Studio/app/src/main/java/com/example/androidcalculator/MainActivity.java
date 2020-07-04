package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText calcEditText;
    float mValueOne, mValueTwo;

    boolean calcAddition, mSubtract, calcMultiplication, calcDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        calcEditText = (EditText) findViewById(R.id.edt1);
    }

    public void OnButton1Click(View view) {
        _addStringToEditText("1");
    }


    public void OnButton2Click(View view) {
        _addStringToEditText("2");
    }

    public void OnButton3Click(View view) {
        _addStringToEditText("3");
    }

    public void OnButton4Click(View view) {
        _addStringToEditText("4");
    }

    public void OnButton5Click(View view) {
        _addStringToEditText("5");
    }

    public void OnButton6Click(View view) {
        _addStringToEditText("6");
    }


    public void OnButton7Click(View view) {
        _addStringToEditText("7");
    }

    public void OnButton8Click(View view) {
        _addStringToEditText("8");
    }


    public void OnButton9Click(View view) {
        _addStringToEditText("9");
    }


    public void OnButton0Click(View view) {
        _addStringToEditText("0");
    }



    public void OnButtonDotClick(View view) {
        _addStringToEditText(".");
    }

    private void _addStringToEditText(String str) {
        calcEditText.setText(calcEditText.getText() + str);
    }
    public void OnButtonAddClick(View view) {
        if (calcEditText == null) {
            calcEditText.setText("");
        } else {
            mValueOne = Float.parseFloat(calcEditText.getText() + "");
            calcAddition = true;
            calcEditText.setText(null);
        }
    }

    public void OnButtonSubstractClick(View view) {
        mValueOne = Float.parseFloat(calcEditText.getText() + "");
        mSubtract = true;
        calcEditText.setText(null);
    }

    public void OnButtonMultiplyClick(View view) {
        mValueOne = Float.parseFloat(calcEditText.getText() + "");
        calcMultiplication = true;
        calcEditText.setText(null);
    }

    public void OnButtonDivClick(View view) {
        mValueOne = Float.parseFloat(calcEditText.getText() + "");
        calcDivision = true;
        calcEditText.setText(null);
    }
    public void OnButtonCalcClick(View view) {
        mValueTwo = Float.parseFloat(calcEditText.getText() + "");

        if (calcAddition == true) {
            calcEditText.setText(mValueOne + mValueTwo + "");
            calcAddition = false;
        }

        if (mSubtract == true) {
            calcEditText.setText(mValueOne - mValueTwo + "");
            mSubtract = false;
        }

        if (calcMultiplication == true) {
            calcEditText.setText(mValueOne * mValueTwo + "");
            calcMultiplication = false;
        }

        if (calcDivision == true) {
            calcEditText.setText(mValueOne / mValueTwo + "");
            calcDivision = false;
        }
    }

        public void OnButtonCClick(View view) {
        calcEditText.setText("");
    }



}