package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class IslaChiloe extends AppCompatActivity {

    Button btn;
    ImageButton ch1,ch2,ch3;
    TextView lugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isla_chiloe);
        btn = (Button) findViewById(R.id.btn_volverCh);
        ch1 = (ImageButton) findViewById(R.id.Ch1);
        ch2 = (ImageButton) findViewById(R.id.Ch2);
        ch3 = (ImageButton) findViewById(R.id.Ch3);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Volver1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Volver1);
            }
        });

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img1 = new Intent(getApplicationContext(),ChiloeImg1.class);
                startActivity(Img1);
            }
        });
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img2 = new Intent(getApplicationContext(),ChiloeImg2.class);
                startActivity(Img2);
            }
        });
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img3 = new Intent(getApplicationContext(),ChiloeMaps.class);
                startActivity(Img3);
            }
        });

    }
}