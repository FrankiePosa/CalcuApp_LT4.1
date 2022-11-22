package com.example.calcuapp;

import static com.example.calcuapp.R.id.edittext3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edittext1;
    private EditText edittext2;
    private EditText edittext3;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1 = (EditText) findViewById(R.id.edittext1);
        edittext2 = (EditText) findViewById(R.id.edittext2);
        edittext3 = (EditText) findViewById(R.id.edittext3);
        Button shadd = findViewById(R.id.button1);
        Button shsubtract = findViewById(R.id.button2);
        Button shmultiply = findViewById(R.id.button3);
        Button shdivide = findViewById(R.id.button4);


        shadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(edittext1.getText().toString());
                int n2 = Integer.parseInt(edittext2.getText().toString());
                int n3 = Integer.parseInt(edittext3.getText().toString());
                int add = n1 + n2 + n3;
                alert(String.valueOf(add));
            }
        });

        shsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(edittext1.getText().toString());
                int n2 = Integer.parseInt(edittext2.getText().toString());
                int n3 = Integer.parseInt(edittext3.getText().toString());
                int subtract = n1 - n2 - n3;
                alert(String.valueOf(subtract));
            }
        });

        shmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(edittext1.getText().toString());
                int n2 = Integer.parseInt(edittext2.getText().toString());
                int n3 = Integer.parseInt(edittext3.getText().toString());
                int multiply = n1 * n2 * n3;
                alert(String.valueOf(multiply));
            }
        });

        shdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(edittext1.getText().toString());
                int n2 = Integer.parseInt(edittext2.getText().toString());
                int n3 = Integer.parseInt(edittext3.getText().toString());
                int divide = n1 / n2 / n3;
                alert(String.valueOf(divide));
            }
        });
    }
    private void alert(String message){
        AlertDialog dlg = new AlertDialog.Builder(MainActivity.this)
                .setTitle("RESULT")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();

                    }
                })
                .create();
        dlg.show();
    }
}