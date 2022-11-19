package com.example.calcuapp;

import static com.example.calcuapp.R.id.edittext3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edittext1;
    private EditText edittext2;
    private EditText edittext3;
    private TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1 = (EditText) findViewById(R.id.edittext1);
        edittext2 = (EditText) findViewById(R.id.edittext2);
        edittext3 = (EditText) findViewById(R.id.edittext3);
        tvresult = (TextView) findViewById(R.id.tvresult);

    }

    public void btnadd(View view) {
        int n1 = Integer.parseInt(edittext1.getText().toString());
        int n2 = Integer.parseInt(edittext2.getText().toString());
        int n3 = Integer.parseInt(edittext3.getText().toString());
        int add = n1 + n2 + n3;
        tvresult.setText(String.valueOf(add));
    }

    public void btnmultiply(View view) {
        int n1 = Integer.parseInt(edittext1.getText().toString());
        int n2 = Integer.parseInt(edittext2.getText().toString());
        int n3 = Integer.parseInt(edittext3.getText().toString());
        int multiply = n1 * n2 * n3;
        tvresult.setText(String.valueOf(multiply));
    }

    public void btnsubtract(View view) {
        int n1 = Integer.parseInt(edittext1.getText().toString());
        int n2 = Integer.parseInt(edittext2.getText().toString());
        int n3 = Integer.parseInt(edittext3.getText().toString());
        int subtract = n1 - n2 - n3;
        tvresult.setText(String.valueOf(subtract));
    }

    public void btndivide(View view) {
        int n1 = Integer.parseInt(edittext1.getText().toString());
        int n2 = Integer.parseInt(edittext2.getText().toString());
        int n3 = Integer.parseInt(edittext3.getText().toString());
        int divide = n1 / n2 / n3;
        tvresult.setText(String.valueOf(divide));
    }
}