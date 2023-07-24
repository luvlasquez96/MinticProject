package com.mintic.university;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Estudiante extends AppCompatActivity {
    Button estudiante,volve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);

        estudiante=findViewById(R.id.buttonSalud);
        estudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Estudiante.this, Ingreso.class);
                startActivity(intent5);
            }
        });

        volve=findViewById(R.id.butonVolverEst);
        volve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Estudiante.this, Ingreso.class);
                startActivity(intent5);
            }
        });
    }
}