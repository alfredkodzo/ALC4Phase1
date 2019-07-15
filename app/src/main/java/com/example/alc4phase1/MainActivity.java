package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Buttons to be declared
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Where to link the buttons to the MainActivity screen
        button1 = findViewById(R.id.button3);
        button2 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyProfile(); //Open My Profile Activity Screen

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutALC (); //Open About ALC Activity Screen
            }
        });
    }

    private void openAboutALC() {
        Intent intent = new Intent(this, ALCWebpage.class);
        startActivity(intent); //Open My Profile Activity Screen (continued)
    }


    private void openMyProfile() {
        Intent intent   = new Intent(this, Myprofile.class);
        startActivity(intent); //Open My Profile Activity Screen (continued)
    }
}




