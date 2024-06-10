package com.example.m1.kiemtra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txthoten, txtsotc, txtthanhtien, txtsodhdanhan, txtsocddanhan;
    RadioButton radnam, radnu, radaihoc, radcaodang;
    Button btntinhhp, btntiep, btnthongke;
    RadioGroup gioitinh, trinhdo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        khaibao();
        btntiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txthoten.setText("");
                txtsotc.setText("");
                txtthanhtien.setText("");
            }
        });
    }
    void khaibao(){
        txthoten = (EditText) findViewById(R.id.txthoten);
        txtsotc = (EditText) findViewById(R.id.txtsotc);
        txtthanhtien = (EditText) findViewById(R.id.txtthanhtien);
        txtsodhdanhan = (EditText) findViewById(R.id.txtdhdanhan);
        txtsocddanhan = (EditText) findViewById(R.id.txtcddanhan);

        radnam = (RadioButton) findViewById(R.id.radnam);
        radnu = (RadioButton) findViewById(R.id.radnu);
        radaihoc = (RadioButton) findViewById(R.id.raddaihoc);
        radcaodang = (RadioButton) findViewById(R.id.radcaodang);

        btntinhhp = (Button) findViewById(R.id.btnthp);
        btntiep = (Button) findViewById(R.id.btntien);
        btnthongke = (Button) findViewById(R.id.btnthongke);

        gioitinh = (RadioGroup) findViewById(R.id.gioitinh);
        trinhdo = (RadioGroup) findViewById(R.id.trinhdo);
    }

    void kiemtragioitinh(){
        String bang = "";

        int id = gioitinh.getCheckedRadioButtonId();
        if (id == 1){
            Toast.makeText(this, "phai chon gioi tinh", Toast.LENGTH_SHORT).show();
            return;
        }
        RadioButton rad = (RadioButton) findViewById(id);
        bang = rad.getText().toString();
    }

    void kiemtrahang(){
        String bang = "";

        int id = gioitinh.getCheckedRadioButtonId();
        if (id == 1){
            Toast.makeText(this, "phai chon trinh do", Toast.LENGTH_SHORT).show();
            return;
        }
        RadioButton rad = (RadioButton) findViewById(id);
        bang = rad.getText().toString();
    }
}
