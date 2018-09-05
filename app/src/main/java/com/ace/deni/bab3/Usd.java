package com.ace.deni.bab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOError;

public class Usd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usd);

        final Button butto = findViewById(R.id.aaaa);
        butto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                convert();
            }
        });

        final Button button = findViewById(R.id.aaa);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                conver();
            }
        });

        final Button bu = findViewById(R.id.Clear);
        bu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                TextView textView1 = findViewById(R.id.outputUSD);
                EditText editText1= findViewById(R.id.inputIDR);
                TextView textView = findViewById(R.id.outputIDR);
                EditText editText= findViewById(R.id.inputUSD);
                editText.setText("");
                editText1.setText("");
                textView.setText("Rupiah");
                textView1.setText("Dollar");
            }
        });
    }

    public void convert (){
        //USD to IDR
        TextView textView = findViewById(R.id.outputIDR);
        EditText editText= findViewById(R.id.inputUSD);
        String dolar;
        int USD,IDR;

        try {
            dolar = editText.getText().toString();
            USD = Integer.parseInt(dolar);
        } catch (IOError error) {
            USD = 0;
        }

        if (USD > 0) {
            IDR = USD * 14943;
            String rp = String.valueOf(IDR);
            textView.setText(rp);
        } else {
            textView.setText("0");
        }
   }


    public void conver (){
        TextView textView1 = findViewById(R.id.outputUSD);
        EditText editText1= findViewById(R.id.inputIDR);
        // IDR to USD
        String rupiah;
        double USD,IDR;

        try {
            rupiah = editText1.getText().toString();
            IDR = Double.parseDouble(rupiah);
        } catch (IOError error) {
            IDR = 0;
        }

        if (IDR > 0) {
            USD = IDR / 14943;
            String usd = String.valueOf(USD);
            textView1.setText(usd);
        } else {
            textView1.setText("0");
        }
    }

}
