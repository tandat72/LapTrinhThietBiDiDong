package com.example.m1.bai18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtcsm, txtcsc, txtsoho;
    TextView txttongtien;
    Button btnshbt, btnkd, btnsx;
    int A,B,C,sokw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtcsm = (EditText) findViewById(R.id.txtchisomoi);
        txtcsc = (EditText) findViewById(R.id.txtchisocu);
        txtsoho = (EditText) findViewById(R.id.txtsoho);
        txttongtien = (TextView) findViewById(R.id.txttongtien);
        btnkd = (Button) findViewById(R.id.btnkd);
        btnsx = (Button) findViewById(R.id.btnsx);
        btnshbt = (Button) findViewById(R.id.btnshbt);

        A = Integer.parseInt(txtcsc.getText().toString());
        B = Integer.parseInt(txtcsm.getText().toString());
        C = Integer.parseInt(txtsoho.getText().toString());

        btnkd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A = Integer.parseInt(txtcsc.getText().toString());
                B = Integer.parseInt(txtcsm.getText().toString());
                C = Integer.parseInt(txtsoho.getText().toString());
                sokw=B-A;
                txttongtien.setText("Tổng tiền giá kinh doanh là"+sokw*2320+"VNĐ");//1518
            }
        });
        btnshbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thanhtoan = 0;
                A=Integer.parseInt(txtcsc.getText().toString());
                B = Integer.parseInt(txtcsm.getText().toString());
                C = Integer.parseInt(txtsoho.getText().toString());
                if ((B - A) <= (50 * C))
                    thanhtoan = (B - A) * 1484;
                else if ((B - A) <= (100 * C))
                    thanhtoan = (50 * C * 1484) + ((B - A) - 50 * C) * 1533;
                else if ((B-A) <= 200*C)
                    thanhtoan=(50*C*1484)+(50*C*1533)+ ((B-A)-100*C)*1786;
                else if ((B - A) <= (300 * C))
                    thanhtoan=(50*C*1484)+(50*C*1533)+ (100*C*1786)+((B-A)-200*C)*2242;
                else if ((B-A) <= 400*C)
                    thanhtoan = (50 * C * 1484) + (50 * C * 1533)+ (100 * C * 1786)+ (100 * C * 2242)+ ((B-A) - 300 * C) * 2503;
                else if ((B-A) <= 500*C)
                    thanhtoan = (50 * C * 1484) + (50 * C * 1533)+ (100 * C * 1786)+ (100 * C * 2242)+ (100 * C * 2503) + ((B-A) - 400 * C) * 2587;
                txttongtien.setText("Tổng tiền điện và sinh hoạt");
            }
        });

    }
}
