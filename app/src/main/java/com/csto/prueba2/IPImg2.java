package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IPImg2 extends AppCompatActivity {

    Button vol9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipimg2);
        vol9 = (Button) findViewById(R.id.btn9);

        vol9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vo9 = new Intent(getApplicationContext(), IslaPascua.class);
                startActivity(vo9);
            }
        });
    }
}