package com.ans.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class logged_visitor extends AppCompatActivity {

    TextView tvCheckin;
    TextView tvCheckout;
    Button btnCheckin;
    Button btnCeckout;
    Button btnAvail;
    Calendar c;
    DatePickerDialog dpd;
    DatePickerDialog dpd1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_visitor);

        tvCheckin = findViewById(R.id.tvckin);
        tvCheckout = findViewById(R.id.tvckout);
        btnCheckin = findViewById(R.id.cinbtn);
        btnCeckout = findViewById(R.id.coutbtn);
        btnAvail = findViewById(R.id.buttonavail);

        //Calendar calendar = Calendar.getInstance();
        //final int year = calendar.get(Calendar.YEAR);
        //final int month = calendar.get(Calendar.MONTH);
        //final int day = calendar.get(Calendar.DAY_OF_MONTH);

        btnCheckin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);

                dpd = new DatePickerDialog(logged_visitor.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int mYear, int mMonth, int mDay) {
                        tvCheckin.setText(mDay + "/" + (mMonth + 1) + "/" + mYear);
                    }
                }, day, month, year);
                dpd.show();


            }
        });

        btnCeckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);

                dpd1 = new DatePickerDialog(logged_visitor.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int mYear, int mMonth, int mDay) {
                        tvCheckout.setText(mDay + "/" + (mMonth + 1) + "/" + mYear);
                    }
                }, day, month, year);
                dpd1.show();


            }
        });
        btnAvail.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                startActivity(new Intent(logged_visitor.this, BookingFinal.class));
            }
        });

        //private Boolean validate(){
            Boolean result = false;

            String Checkin = tvCheckin.getText().toString();
            String Checkout = tvCheckout.getText().toString();
            //String email = userEmail.getText().toString();

            if(Checkin.isEmpty() && Checkout.isEmpty()) {

                Toast.makeText(this, "Please enter all detail", Toast.LENGTH_SHORT).show();
            }else {
                result = true;

            }

            //return result;
        }

    }

