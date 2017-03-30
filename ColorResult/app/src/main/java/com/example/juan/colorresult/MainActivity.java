package com.example.juan.colorresult;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redBackground(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("color","red");
        startActivityForResult(intent,1);
        finish();
    }

    public void greenBackground(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("color","green");
        startActivityForResult(intent,1);
        finish();
    }

    public void blueBackground(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("color","blue");
        startActivityForResult(intent,1);
        finish();
    }

}
