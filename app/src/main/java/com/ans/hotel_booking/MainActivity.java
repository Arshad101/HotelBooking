package com.ans.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Visitors;
    private Button Admin;
    //private TextView Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Visitors = (Button)findViewById(R.id.btnVis);
        Admin = (Button)findViewById(R.id.btnAdm);
        //Register = (TextView)findViewById(R.id.registv);

        Visitors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Visitors_login.class));
            }
        });
        Admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Admin_login.class));
            }
        });
        //Register.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View view) {
               // startActivity(new Intent(MainActivity.this, Register_activity.class));
           // }
       // });



    }
}