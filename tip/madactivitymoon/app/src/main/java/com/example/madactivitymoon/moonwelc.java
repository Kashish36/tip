package com.example.madactivitymoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class moonwelc extends AppCompatActivity {
    private Spinner spinner;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moonwelc);

        spinner = findViewById(R.id.spinner1);
        image = findViewById(R.id.image);
        String[] moon = {
                "Travel",
                "Food",
                "Stay",
                "Miscellaneous",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, moon);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        image.setImageResource(android.R.color.transparent);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.travel);
                        Intent launchi = new Intent(moonwelc.this, launchinformation.class);
                        startActivity(launchi);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.food);
                        Intent trajecti = new Intent(moonwelc.this, trajectoryinformation.class);
                        startActivity(trajecti);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.stay);
                        Intent southi = new Intent(moonwelc.this, southpoleinformation.class);
                        startActivity(southi);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.other);
                        Intent rocketi = new Intent(moonwelc.this, rocketinformation.class);
                        startActivity(rocketi);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // DO ABSOLUTELY NOTHING WHEN NOTHING IS SELECTED
            }
        });


    }
}