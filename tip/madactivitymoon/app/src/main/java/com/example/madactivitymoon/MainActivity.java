package com.example.madactivitymoon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView textviewa;
    public TextView textviewb;
    private ImageView image1;
    ConstraintLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textviewa = findViewById(R.id.textView1);
        textviewb = findViewById(R.id.textView2);
        image1 = findViewById(R.id.imageView1);
        //image1.setImageResource(R.drawable.nmims);

        mainLayout = findViewById(R.id.mainlayout);
        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,moonwelc.class);
                startActivity(i);
            }
        });

        //image2.setImageResource(R.drawable.android);
    }
}
