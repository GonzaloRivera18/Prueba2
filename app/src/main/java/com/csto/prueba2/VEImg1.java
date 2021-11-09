package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VEImg1 extends AppCompatActivity {


    Button VolverElq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veimg1);
        VolverElq = (Button) findViewById(R.id.btnVolverElq);

        VolverElq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Volv = new Intent(getApplicationContext(), ValleElqui.class);
                startActivity(Volv);
            }
        });
    }
}