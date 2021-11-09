package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChiloeImg2 extends AppCompatActivity {

    Button volv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiloe_img2);
        volv = (Button) findViewById(R.id.btn_volver3);

        volv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v2 = new Intent(getApplicationContext(), IslaChiloe.class);
                startActivity(v2);
            }
        });
    }
}