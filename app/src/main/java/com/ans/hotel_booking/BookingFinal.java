package com.ans.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BookingFinal extends AppCompatActivity {
    Button single;
    Button luxury;
    Button Standard;
    Button Deluxe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_final);
        single = (Button)findViewById(R.id.button3);
        luxury = (Button)findViewById(R.id.button5);
        Standard = (Button)findViewById(R.id.button6);
        Deluxe = (Button)findViewById(R.id.button7);

        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Your Booking is Successful",Toast.LENGTH_SHORT).show();
            }
        });
        luxury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Your Booking is Successful",Toast.LENGTH_SHORT).show();
            }
        });
        Standard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Your Booking is Successful",Toast.LENGTH_SHORT).show();
            }
        });
        Deluxe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Your Booking is Successful",Toast.LENGTH_SHORT).show();
            }
        });
    }
}