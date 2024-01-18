package com.example.madactivitymoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    Button back;
    TextView dateAndTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.child);

        dateAndTime = findViewById(R.id.dateandtime);
        back = findViewById(R.id.back);

        // Retrieving a bundle, basically all messages sent
        // By the Calling Activity (i.e. MainActivity.class)
        Bundle bundle = getIntent().getExtras();
        String date = bundle.getString("date");
        String time = bundle.getString("time");

        dateAndTime.setText(date + " " + time);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChildActivity.this, WebActivity.class);
                startActivity(i);
            }
        });
    }
}
