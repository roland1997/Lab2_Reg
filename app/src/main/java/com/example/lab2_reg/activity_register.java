package com.example.lab2_reg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_register extends AppCompatActivity {
    private Button registerInButton;
    public EditText department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        department = findViewById(R.id.departmentLabel);
        registerInButton = (Button) findViewById(R.id.registerInButton);
        registerInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });


    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("Depart", department.getText().toString());
        startActivity(intent);
    }
}
