package com.example.lab2_reg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class activity_profile extends AppCompatActivity {
    TextView firstnameshow, lastnameshow, departmentshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String messagefirst, messagelast, messagedepart;
        Bundle extras = getIntent().getExtras();

        setContentView(R.layout.activity_profile);

        firstnameshow = findViewById(R.id.firstNameShow);
        lastnameshow = findViewById(R.id.lastNameShow);
        departmentshow = findViewById(R.id.departmentShow);

        messagefirst = extras.getString("FirstName");
        messagelast = extras.getString("LastName");
        messagedepart = extras.getString("Department");

        firstnameshow.setText(messagefirst);
        lastnameshow.setText(messagelast);
        departmentshow.setText(messagedepart);


    }
}
