package com.nuhcan.androidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button backButton = findViewById(R.id.button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });


        Button buttonRouter2023 = (Button) findViewById(R.id.button3);
        Button buttonRouter2022 = (Button) findViewById(R.id.button4);
        Button buttonRouter2021 = (Button) findViewById(R.id.button5);
        Button buttonRouter2020 = (Button) findViewById(R.id.button6);
        Button buttonRouter2019 = (Button) findViewById(R.id.button7);

        buttonRouter2023.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity2023.class);
                startActivity(intent);
            }
        });

        buttonRouter2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity2022.class);
                startActivity(intent);
            }
        });

        buttonRouter2021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity2021.class);
                startActivity(intent);
            }
        });

        buttonRouter2020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity2020.class);
                startActivity(intent);
            }
        });

        buttonRouter2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity2019.class);
                startActivity(intent);
            }
        });


    }
}