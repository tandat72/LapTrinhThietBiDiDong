package com.example.m1.thuchanh;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText txthoten, txtcmnd, txtbosung;
    RadioButton radtrungcap, radcaodang, raddaihoc;
    RadioGroup radbangcap;
    Button btngui;
    CheckBox ckdocsach, ckdocbao, ckdoccoding;
    String ns="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        khaibao();
        btngui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showinfor();
            }
        });
    }
    void  khaibao()
    {
        txthoten= (EditText) findViewById(R.id.txthoten);
        txtcmnd= (EditText) findViewById(R.id.txtcmnd);
        txtbosung= (EditText) findViewById(R.id.txtbosung);

        radbangcap= (RadioGroup) findViewById(R.id.radbangcap);

        radtrungcap = (RadioButton) findViewById(R.id.radtrungcap);
        radcaodang = (RadioButton) findViewById(R.id.radcaodang);
        raddaihoc = (RadioButton) findViewById(R.id.raddaihoc);

        ckdocbao = (CheckBox) findViewById(R.id.ckdocbao);
        ckdocsach = (CheckBox) findViewById(R.id.ckdocsach);
        ckdoccoding = (CheckBox) findViewById(R.id.ckdoccoding);

        btngui = (Button) findViewById(R.id.btngui);

    }
    void showinfor(){
        String ten = txthoten.getText().toString();
        ten = ten.trim();
        if (ten.length()<3)
        {
            txthoten.requestFocus();
            txthoten.selectAll();
            Toast.makeText(this,"Tên của bạn phải nhiều hơn 3 kí tự", Toast.LENGTH_SHORT).show();
            return;
        }
        String cmnd = txtcmnd.getText().toString();
        cmnd = cmnd.trim();
        if (cmnd.length()!=9)
        {
            txtcmnd.requestFocus();
            txtcmnd.selectAll();
            Toast.makeText(this,"CMND của bạn phải nhiều hơn 9 kí tự", Toast.LENGTH_SHORT).show();
            return;
        }
        String sothich="";
        if (ckdocbao.isChecked()) sothich+=ckdocbao.getText().toString();
        if (ckdocsach.isChecked()) sothich+=ckdocsach.getText().toString();
        if (ckdoccoding.isChecked()) sothich+=ckdoccoding.getText().toString();
        ////////////////////////
        String bangcap="";
        if (radtrungcap.isChecked()) bangcap+=radtrungcap.getText().toString();
        int vitri = radbangcap.getCheckedRadioButtonId();
        if (vitri == - 1)
        {
            Toast.makeText(this, "Phải chọn bằng cấp", Toast.LENGTH_SHORT).show();
        }
        RadioButton rad = (RadioButton) findViewById(vitri);
        bangcap = rad.getText()+"";
        //////////////////////////
        String bosung = txtbosung.getText().toString();
        ns+=ten+"\n";
        ns+=cmnd+"\n";
        ns+=sothich+"\n";
        ns+=bangcap+"\n";
        ns+=bosung;

        AlertDialog.Builder b=new AlertDialog.Builder(MainActivity.this);
        b.setTitle("Thông tin cá nhân");
        b.setMessage(ns);
        b.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        b.create().show();
    }
    }

