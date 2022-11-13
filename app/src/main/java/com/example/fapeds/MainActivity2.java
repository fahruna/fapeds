package com.example.fapeds;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView image_ml = (ImageView) findViewById(R.id.image_ml);
        ImageView image_genshin = (ImageView) findViewById(R.id.image_genshin);
        ImageView image_lol = (ImageView) findViewById(R.id.image_lol);
        ImageView image_valo = (ImageView) findViewById(R.id.image_valo);
        ImageView image_apex = (ImageView) findViewById(R.id.image_apex);
        ImageView image_ff = (ImageView) findViewById(R.id.image_ff);


        image_ml.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this,pilih.class);
            startActivity(intent);
        });

        image_genshin.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this,pilih2.class);
            startActivity(intent);
        });

        image_lol.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this,pilih4.class);
            startActivity(intent);
        });

        image_apex.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this,pilih3.class);
            startActivity(intent);
        });

        image_valo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this,pilih5.class);
            startActivity(intent);
        });

        image_ff.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this,pilih6.class);
            startActivity(intent);
        });

    }
}