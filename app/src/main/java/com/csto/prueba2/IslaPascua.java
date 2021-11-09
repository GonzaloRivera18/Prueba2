package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class IslaPascua extends AppCompatActivity {

    ImageButton i1,i2,i3;
    Button vol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isla_pascua);

        vol = (Button) findViewById(R.id.btn_volver7);



        i1 = (ImageButton) findViewById(R.id.ip1);
        i2 = (ImageButton) findViewById(R.id.ip2);
        i3 = (ImageButton) findViewById(R.id.ip3);


        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img1 = new Intent(getApplicationContext(),IPImg1.class);
                startActivity(Img1);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img2 = new Intent(getApplicationContext(),IPImg2.class);
                startActivity(Img2);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img3 = new Intent(getApplicationContext(),IPMaps.class);
                startActivity(Img3);
            }
        });

        vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Volv5 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(Volv5);
            }
        });
    }
}