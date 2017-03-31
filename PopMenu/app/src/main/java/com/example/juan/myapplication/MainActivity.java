package com.example.juan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                PopupMenu pop = new PopupMenu(MainActivity.this,boton);
                pop.getMenuInflater().inflate(R.menu.menu,pop.getMenu());

                pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MainActivity.this,item.getTitle()
                                + " se ha presionado",Toast.LENGTH_SHORT).show();
                        return true;

                }
                });
                pop.show();
            }
        });
    }
}
