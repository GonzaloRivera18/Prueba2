package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IPImg1 extends AppCompatActivity {

    Button v8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipimg1);
        v8 = (Button) findViewById(R.id.btn8);

        v8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vol8 = new Intent(getApplicationContext(), IslaPascua.class);
                startActivity(vol8);
            }
        });
    }
}