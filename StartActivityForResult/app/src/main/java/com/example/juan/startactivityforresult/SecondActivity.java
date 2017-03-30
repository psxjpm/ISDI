package com.example.juan.startactivityforresult;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText editTxt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
        editTxt = (EditText)findViewById(R.id.editText1);
        btn=(Button)findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {
                String message=editTxt.getText().toString();
                Intent intent=new Intent();
                intent.putExtra("MESSAGE",message);
                setResult(2,intent);
                finish();
            }
        });
    }
}
