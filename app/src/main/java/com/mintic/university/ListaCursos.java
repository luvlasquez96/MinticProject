package com.mintic.university;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaCursos<estudiantes> extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private TextView tv1,tv2;
    private ListView lv1,lv2;
    private ArrayList<String> estudiantes;


    private final String programa[] = {" Java"," Python"," Ventas"," Habilidades"," CSS "," HTML"," C++",
            " C#"," PHP"," SQL"};

    private final String Horario[] = {" 10:00 "," 8:00"," 11:00 "," 2:00 "," 6:00"," 1:00 "," 7:00 ",
            " 3:00 "," 9:00 "," 4:00 "};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);


        tv1=findViewById(R.id.txtV1);
        lv1=findViewById(R.id.listV1);
        tv2=findViewById(R.id.txtV2);
        lv2=findViewById(R.id.listv2);

        estudiantes= new ArrayList<String>();
        estudiantes.add("Samuel Arenas");
        estudiantes.add("Maria Barreto");
        estudiantes.add("Angel Borda");
        estudiantes.add("Maycol Cantor");
        estudiantes.add("Gabriela Cañon");
        estudiantes.add("Rut Cardenas");
        estudiantes.add("Angela Cubillos");
        estudiantes.add("Sebastian Diaz");
        estudiantes.add("Sergio Echeverria");
        estudiantes.add("Jhoan Gonzalez");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_view_info, programa);
        ArrayAdapter<String> adapter1= new ArrayAdapter<>(this,R.layout.list_view_info, estudiantes);
        Adaptador adp = new Adaptador(this, R.layout.item, estudiantes);

        lv1.setAdapter(adapter);
        lv2.setAdapter((ListAdapter) adp);


        lv1.setOnItemClickListener(this);
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv2.setText(" Estudiante: "+lv2.getItemAtPosition(position)+"  Programa:"+programa[position]);
            }
        });

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        tv1.setText("Programa: "+lv1.getItemAtPosition(position)+"  Hora: "+Horario[position]);
        Log.d("ListaCursos","A seleccionado: "+programa[position]);
    }
}