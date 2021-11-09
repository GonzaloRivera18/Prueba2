package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ValleElqui extends AppCompatActivity {

    Button volvE;
    ImageButton ve1,ve2,ve3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valle_elqui);
        volvE = (Button) findViewById(R.id.btn_elq);



        ve1 = (ImageButton) findViewById(R.id.v1);
        ve2 = (ImageButton) findViewById(R.id.v2);
        ve3 = (ImageButton) findViewById(R.id.v3);


        ve1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img1 = new Intent(getApplicationContext(),VEImg1.class);
                startActivity(Img1);
            }
        });
        ve2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img2 = new Intent(getApplicationContext(),VEImg2.class);
                startActivity(Img2);
            }
        });
        ve3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img3 = new Intent(getApplicationContext(),ValleElquiMaps.class);
                startActivity(Img3);
            }
        });

        volvE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Volv5 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(Volv5);
            }
        });


    }
}