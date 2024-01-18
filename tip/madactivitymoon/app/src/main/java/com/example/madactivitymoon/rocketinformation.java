package com.example.madactivitymoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class rocketinformation extends AppCompatActivity {
    private Button back;
    private ImageView image;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocketinformation);

        back = findViewById(R.id.buttonr);
        image = findViewById(R.id.imagerocket);
        info = findViewById(R.id.inforocket);

        image.setImageResource(R.drawable.other);
        info.setText(R.string.info_rocket);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rocketinformation.this, CalcActivity.class);
                startActivity(intent);
            }
        });
    }
}




