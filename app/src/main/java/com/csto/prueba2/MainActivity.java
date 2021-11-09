package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner Sp;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sp = (Spinner) findViewById(R.id.sp_lugares);
        btn = (Button) findViewById(R.id.btn_continuar);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eleccion = Sp.getSelectedItem().toString();
                if (eleccion.equals("Valle del Elqui")) {
                    Intent VE = new Intent(getApplicationContext(), ValleElqui.class);
                    VE.putExtra("LUGAR", eleccion);
                    startActivity(VE);
                }
                else if (eleccion.equals("Isla de pascua"))
                {
                    Intent IP = new Intent(getApplicationContext(),IslaPascua.class);
                    IP.putExtra("LUGAR",eleccion);
                    startActivity(IP);
                }
                else if (eleccion.equals("Isla grande de Chiloé"))
                {
                    Intent ICH = new Intent(getApplicationContext(), IslaChiloe.class);
                    ICH.putExtra("LUGAR",eleccion);
                    startActivity(ICH);
                }
            }
        });


    }
}