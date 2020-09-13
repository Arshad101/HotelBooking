package com.ans.hotel_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin_login extends AppCompatActivity {

    EditText Admnuser;
    EditText Admnpass;
    Button Admnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        Admnuser = (EditText)findViewById(R.id.AdmetName);
        Admnpass= (EditText)findViewById(R.id.Admetpass);
        Admnlogin= (Button) findViewById(R.id.Admbtnlogin);

        Admnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Admnuser.getText().toString(), Admnpass.getText().toString());
            }
        });
    }
    private void validate(String userName, String userPassword) {
        if ((userName.equals("Admin")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(Admin_login.this, logged_admin.class);
            startActivity(intent);
        } else
            Toast.makeText(Admin_login.this, "Login Failed", Toast.LENGTH_SHORT).show();
    }
}