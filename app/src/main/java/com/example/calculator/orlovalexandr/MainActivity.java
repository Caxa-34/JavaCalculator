package com.example.calculator.orlovalexandr;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ta, tb;
    TextView tres;
    double a, b, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.plainA);
        tb = findViewById(R.id.plainB);
        tres = findViewById(R.id.plainRes);
    }

    void calculation(String act)
    {
        try
        {
            a = Double.parseDouble(ta.getText().toString());
            b = Double.parseDouble(tb.getText().toString());
        }
        catch (Exception e)
        {
            tres.setText("Ошибка: Некорректные данные");
            return;
        }
        switch (act)
        {
            case "add":
                res = a + b;
                break;
            case "sub":
                res = a - b;
                break;
            case "mult":
                res = a * b;
                break;
            case "div":
                if (b == 0)
                {
                    tres.setText("Ошибка: Деление на 0");
                    return;
                }
                res = a / b;
                break;
            case "sin":
                res = Math.sin(a);
                break;
            case "cos":
                res = Math.cos(a);
                break;
            case "tan":
                res = Math.tan(a);
                break;
            case "log":
                if (a < 0)
                {
                    tres.setText("Ошибка: Логарифм отрицательного числа");
                    return;
                }
                res = Math.log(a)/Math.log(b);
                break;
            case "lg":
                if (a < 0)
                {
                    tres.setText("Ошибка: Логарифм отрицательного числа");
                    return;
                }
                res = Math.log10(a);
                break;
            case "ln":
                if (a < 0)
                {
                    tres.setText("Ошибка: Логарифм отрицательного числа");
                    return;
                }
                res = Math.log(a);
                break;
            case "sqrt":
                if (a < 0)
                {
                    tres.setText("Ошибка: Корень отрицательного числа");
                    return;
                }
                res = Math.sqrt(a);
                break;
            case "qrtb":
                if (a < 0)
                {
                    tres.setText("Ошибка: Корень отрицательного числа");
                    return;
                }
                res = Math.pow(a, 1/b);
                break;
            case "pow":
                res = Math.pow(a, 2);
                break;
            case "powb":
                res = Math.pow(a, b);
                break;
            default:
                break;
        }
        tres.setText(String.valueOf(res));
    }


    public void add_CLick(View v) { calculation("add"); }
    public void sub_CLick(View v)
    {
        calculation("sub");
    }
    public void mult_CLick(View v)
    {
        calculation("mult");
    }
    public void div_CLick(View v)
    {
        calculation("div");
    }
    public void sin_CLick(View v)
    {
        calculation("sin");
    }
    public void cos_CLick(View v)
    {
        calculation("cos");
    }
    public void tan_CLick(View v)
    {
        calculation("tan");
    }
    public void log_CLick(View v)
    {
        calculation("log");
    }
    public void lg_CLick(View v)
    {
        calculation("lg");
    }
    public void ln_CLick(View v)
    {
        calculation("ln");
    }
    public void sqrt_CLick(View v)
    {
        calculation("sqrt");
    }
    public void qrtb_CLick(View v)
    {
        calculation("qrtb");
    }
    public void pow_CLick(View v)
    {
        calculation("pow");
    }
    public void powb_CLick(View v)
    {
        calculation("powb");
    }
}