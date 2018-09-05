package com.ace.deni.bab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOError;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    String User,Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.butonSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                EditText user = (EditText)findViewById(R.id.user);
                EditText password = (EditText)findViewById(R.id.password);
                try{
                    User = user.getText().toString();
                    Password = password.getText().toString();}
                catch (IOError e){
                    User = "a";
                    Password ="b";
                }
                if (User.equalsIgnoreCase("admin")&&Password.equalsIgnoreCase("admin")){
                    Intent i = new Intent(MainActivity.this, menu.class);
                    startActivity(i);
                    onDestroy();

                }else{
                    Toast.makeText(getApplicationContext(), "Login Gagal",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
