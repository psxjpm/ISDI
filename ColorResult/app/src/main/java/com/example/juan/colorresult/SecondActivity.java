package com.example.juan.colorresult;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.content.Intent;
import android.graphics.Color;

public class SecondActivity extends AppCompatActivity {
    LinearLayout containerTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);

        containerTwo = (LinearLayout) findViewById(R.id.containerTwo);

        Intent intent = getIntent();
        String color = intent.getStringExtra("color");
        changeBackground(color);

    }

    public void openActivityOne(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void changeBackground(String color) {
        if (color.equals("red")) {
            containerTwo.setBackgroundColor(Color.RED);
        } else if (color.equals("green")) {
            containerTwo.setBackgroundColor(Color.GREEN);
        } else if (color.equals("blue")) {
            containerTwo.setBackgroundColor(Color.BLUE);
        }
    }
}
