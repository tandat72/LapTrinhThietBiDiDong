package com.example.m1.bai15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtFar, txtCel;
    Button btnFar, btnCel, btnClear;
    float Far,Cel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFar= (EditText) findViewById(R.id.txtFar);
        txtCel= (EditText) findViewById(R.id.txtCel);
        btnFar= (Button) findViewById(R.id.btnFar);
        btnCel= (Button) findViewById(R.id.btnCel);
        btnClear= (Button) findViewById(R.id.btnClear);

        btnFar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //bản này nhập độ F, tính sang độ C
                Far=Float.parseFloat(txtFar.getText().toString());
                Cel=(Far-32)*5/9;
                txtCel.setText(Cel+"");
            }
        });
        btnCel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Cel=Float.parseFloat(txtFar.getText().toString());
                Far=Cel*9/5+32;
                txtFar.setText(Far+"");
            }
            });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFar.setText("");
                txtCel.setText("");
            }
        });
}
}
