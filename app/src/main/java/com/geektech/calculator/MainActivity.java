package com.geektech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private String operator;
    private TextView tvResult;
    private Integer first;
    private Integer second;
    private Boolean isOperationClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);

    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                //нажал на единицу
                setNumber("1");
                break;
            case R.id.btn_three3:
            setNumber("3");
            break;
            case R.id.btn_foure4:
                setNumber("4");
                break;
            case R.id.btn_five5:
                setNumber("5");
                break;
            case R.id.btn_six6:
                setNumber("6");
                break;
            case R.id.btn_seven7:
                setNumber("7");
                break;
            case R.id.btn_eight8:
                setNumber("8");
                break;
            case R.id.btn_nine9:
                setNumber("9");
                break;
            case R.id.btn_zero:
                setNumber("0");
                break;
            case R.id.btn_clear:
                tvResult.setText("0");
                first = 0;
                second = 0;
                break;

        }
        tvResult.setText(operator);


    }

    public void setNumber(String number){
        if(tvResult.getText().toString().equals("0")) tvResult.setText(number);
        else if(isOperationClick) tvResult.setText(number);
        else tvResult.append(number);
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
            setFirst();
            isOperationClick = true;
            operator = "+";
            break;

            case R.id.btn_minus:
                setFirst();
                isOperationClick = true;
                operator = "-";
                break;
            case R.id.umnog:
                setFirst();
                isOperationClick = true;
                operator = "*";
                break;
            case R.id.delenie:
                setFirst();
                isOperationClick = true;
                operator = "/";
                break;
            case R.id.btn_prochent:
                setFirst();
                isOperationClick = true;
                operator = "%";
                break;
            case R.id.plusminus:
                setFirst();
                isOperationClick = true;
                operator = "+/-";
                break;




            case R.id.btn_equal:
                second = Integer.parseInt(tvResult.getText().toString());
                Integer result = 0;
                tvResult.setText(result.toString());
                isOperationClick = true;
                switch (operator){
                    case "+":
                        result = first + second;
                        tvResult.setText(result.toString());
                        break;

                    case "-":
                        result = first - second;
                        tvResult.setText(result.toString());
                        break;
                    case "*":
                        result = first * second;
                        tvResult.setText(result.toString());
                        break;
                    case "/":
                        result = first / second;
                        tvResult.setText(result.toString());
                        break;
                    case "%":
                        result = first  / 100;
                        tvResult.setText(result.toString());
                        break;

                    case "+/-":
                        result = first *= - 1;
                        tvResult.setText(result.toString());
                        break;

                }
                break;
        }
        }


public void setFirst(){
    first = Integer.parseInt(tvResult.getText().toString());
}
    public void onOperationEgual(View view) {
       String second = tvResult.getText().toString();


       }
    }

