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
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else if (isOperationClick) {
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }
                isOperationClick = false;
                break;
            case R.id.btn_two:
                //нажал на двойку
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else if (isOperationClick) {
                    tvResult.setText("2");
                } else {
                    tvResult.append("2");
                }
                isOperationClick = false;
                break;
            case R.id.btn_clear:
                tvResult.setText("0");

                break;
            case R.id.btn_three3:

                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else if (isOperationClick) {
                    tvResult.setText("3");
                } else {
                    tvResult.append("3");
                }
                isOperationClick = false;
                break;
            case R.id.btn_foure4:
                //нажал на единицу
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                } else if (isOperationClick) {
                    tvResult.setText("4");
                } else {
                    tvResult.append("4");
                }
                isOperationClick = false;
                break;
            case R.id.btn_five5:

                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else if (isOperationClick) {
                    tvResult.setText("5");
                } else {
                    tvResult.append("5");
                }
                isOperationClick = false;
                break;
            case R.id.btn_six6:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else if (isOperationClick) {
                    tvResult.setText("6");
                } else {
                    tvResult.append("6");
                }
                isOperationClick = false;
                break;
            case R.id.btn_seven7:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else if (isOperationClick) {
                    tvResult.setText("7");
                } else {
                    tvResult.append("7");
                }
                isOperationClick = false;
                break;
            case R.id.btn_eight8:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else if (isOperationClick) {
                    tvResult.setText("8");
                } else {
                    tvResult.append("8");
                }
                isOperationClick = false;
                break;
            case R.id.btn_nine9:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else if (isOperationClick) {
                    tvResult.setText("9");
                } else {
                    tvResult.append("9");
                }
                isOperationClick = false;
                break;
            case R.id.btn_zero:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else if (isOperationClick) {
                    tvResult.setText("0");
                } else {
                    tvResult.append("0");
                }
                isOperationClick = false;
                break;
        }
        tvResult.setText(operator);


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

