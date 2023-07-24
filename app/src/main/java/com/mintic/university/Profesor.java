package com.mintic.university;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profesor extends AppCompatActivity {
    Button cursos, volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesor);

       cursos=findViewById(R.id.buttonlistaCurso);
       cursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(Profesor.this, ListaCursos.class);
                startActivity(intent6);
            }
        });

        volver=findViewById(R.id.butonVolverPro);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(Profesor.this, Estudiante.class);
                startActivity(intent6);
            }
        });


    }
}


