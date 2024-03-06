package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Dictionary;
import java.util.Hashtable;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        EditText input_a = (EditText) findViewById(R.id.input_a);
        EditText input_b = (EditText) findViewById(R.id.input_b);
        EditText input_c = (EditText) findViewById(R.id.input_c);
        Button calc = (Button) findViewById(R.id.btn_calc);
        TextView result = (TextView) findViewById(R.id.label_result);

        calc.setOnClickListener((View v) -> {

            double a = 0;
            double b = 0;
            double c = 0;

            if (!input_a.getText().toString().matches("")){ a = Double.parseDouble(input_a.getText().toString()); }
            if (!input_b.getText().toString().matches("")){ b = Double.parseDouble(input_b.getText().toString()); }
            if (!input_c.getText().toString().matches("")){ c = Double.parseDouble(input_c.getText().toString()); }
            double delta = b*b - 4 *a*c;

            double x = (-b+Math.sqrt(delta)) / (2*a);

            if (x<0){
                result.setText("brak rozwiązań");
                return;
            }

            result.setText("wynik: "+Double.toString(x));
        });

    }
}