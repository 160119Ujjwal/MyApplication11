package com.example.myapplication11;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnadd, btnsub, btnmulti, btndiv, btnequal, btncls;
    String displayNum = "";
    int num1, num2;
    int res;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.edittext);
        btn0=findViewById(R.id.b0);
        btn1=findViewById(R.id.b1);
        btn2 =findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);
        btn5 = findViewById(R.id.b5);
        btn6 = findViewById(R.id.b6);
        btn7 = findViewById(R.id.b7);
        btn8 = findViewById(R.id.b8);
        btn9 = findViewById(R.id.b9);
        btnadd = findViewById(R.id.ba);
        btnsub = findViewById(R.id.bs);
        btndiv = findViewById(R.id.bd);
        btnequal = findViewById(R.id.be);
        btnmulti = findViewById(R.id.bm);
        btncls = findViewById(R.id.bc);

        editText.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnequal.setOnClickListener(this);
        btnmulti.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btncls.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.b1:
                displayNum += 1;
                editText.setText(displayNum);
                break;

            case R.id.b2:
                displayNum += 2;
                editText.setText(displayNum);
                break;

            case R.id.b3:
                displayNum += 3;
                editText.setText(displayNum);
                break;

                case R.id.b4:
                displayNum += 4;
                editText.setText(displayNum);
                break;

                case R.id.b5:
                displayNum += 5;
                editText.setText(displayNum);
                break;

            case R.id.b6:
                displayNum += 6;
                editText.setText(displayNum);
                break;

            case R.id.b7:
                displayNum += 7;
                editText.setText(displayNum);
                break;

            case R.id.b8:
                displayNum += 8;
                editText.setText(displayNum);
                break;

            case R.id.b9:
                displayNum += 9;
                editText.setText(displayNum);
                break;

            case R.id.b0:
                displayNum += 0;
                editText.setText(displayNum);
                break;

            case R.id.bs:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                op = "-";
                break;

            case R.id.ba:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                op = "+";
                break;

            case R.id.bm:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                op = "*";
                break;

            case R.id.bd:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                op = "/";
                break;

            case R.id.be:
                num2 = Integer.parseInt(displayNum);
                res=getResult(op,num1,num2);
                editText.setText(String.valueOf(res));
                break;

            case R.id.bc:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                op = "";
                break;
        }
    }

    private int getResult(String op, int num1, int num2) {
        switch(op)
        {
            case "+":
                return num1+num2;

            case "-":
                return num1-num2;

            case "*":
                return num1*num2;

            case "/":
                return num1/num2;

            default:
                return 0;
        }
    }


}