package com.example.lab2_reg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button signInButton,registerButton;
    public EditText firstName;
    public EditText lastName;
    public String dep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signInButton = (Button) findViewById(R.id.singInButton);
        registerButton = (Button) findViewById(R.id.registerButton);
        firstName = findViewById(R.id.firstNameLabel);
        lastName = findViewById(R.id.lastNameLabel);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityProfile();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRegister();
            }
        });
        String messagedep = null;
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
        messagedep = extras.getString("Depart");
        }
        dep = messagedep;


    }

    public  void openActivityProfile(){

        Intent intent = new Intent(this, activity_profile.class);
        intent.putExtra("FirstName",firstName.getText().toString());
        intent.putExtra("LastName", lastName.getText().toString());
        intent.putExtra("Department",dep);
        startActivity(intent);
    }

    public void openActivityRegister(){
        Intent intent = new Intent(this, activity_register.class);
        startActivity(intent);
    }
}
