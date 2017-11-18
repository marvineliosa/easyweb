package com.easyweb.marvin.easyweb;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

import static android.R.attr.id;

public class pagina_principal extends AppCompatActivity {
    TabHost tab;
    TabHost tabEjemplos;
    ListView listaInicio;
    ListView listaEjemplosHTML;
    ListView listaEjemplosJS;
    ListView listaEjemplosJQuery;


    int[] idNombre = {1,2,3};
    int[] idEjemplos = {1,2,3,4,5};
    String[] nombre = {"¿Que es HTML?","¿Que es JavaScript?","Modelo Cliente - Servidor"};
    String[] ejemplosHTML = {"<a>","<br>","<hr>","<h1>","<form>"};
    String[] ejemplosJS = {"Funciones","Variables","Cambiar Elementos HTML","Comentarios","Elementos desde JS"};
    String[] ejemplosJQUERY = {"ajax","addClass","attr","hasClass","html"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
        //getSupportActionBar().hide();
        listaInicio = (ListView) findViewById(R.id.listaInicio);
        listaEjemplosHTML = (ListView) findViewById(R.id.listaHTML);
        listaEjemplosJS = (ListView) findViewById(R.id.listaJS);
        listaEjemplosJQuery = (ListView) findViewById(R.id.listaJQuery);
        //inicializacion de los elementos del tab principal
        tab = (TabHost) findViewById(R.id.menuTab);
        tab.setup();
        TabSpec ts1 = tab.newTabSpec("tsInicio");
        ts1.setIndicator("Inicio");
        ts1.setContent(R.id.tab1);
        tab.addTab(ts1);

        TabSpec ts2 = tab.newTabSpec("tsEjemplos");
        ts2.setIndicator("Ejemplos");
        ts2.setContent(R.id.tab2);
        tab.addTab(ts2);

        TabSpec ts3 = tab.newTabSpec("tsQuizz");
        ts3.setIndicator("Quizz");
        ts3.setContent(R.id.tab3);
        tab.addTab(ts3);

        tab.setCurrentTab(0);

        //inicializacion de los elementos del tab de ejemplos
        tabEjemplos = (TabHost) findViewById(R.id.ejemplosTab);
        tabEjemplos.setup();
        TabSpec tsHTML = tab.newTabSpec("tsHTML");
        tsHTML.setIndicator("HTML");
        tsHTML.setContent(R.id.tabHTML);
        tabEjemplos.addTab(tsHTML);

        TabSpec tsJS = tab.newTabSpec("tsJavaScript");
        tsJS.setIndicator("JavaScript");
        tsJS.setContent(R.id.tabJS);
        tabEjemplos.addTab(tsJS);

        TabSpec tsJQUERY = tab.newTabSpec("tsJQuery");
        tsJQUERY.setIndicator("jQuery");
        tsJQUERY.setContent(R.id.tabJQUERY);
        tabEjemplos.addTab(tsJQUERY);

        tabEjemplos.setCurrentTab(0);

        llenaListaInicio();
        llenaEjemplosHTML();
        llenaEjemplosJS();
        llenaEjemplosJQuery();
    }

    public void llenaListaInicio(){
        MyAdapter adapter=new MyAdapter (getApplicationContext(),nombre,idNombre);
        listaInicio.setAdapter(adapter);
        listaInicio.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i,long l){
                Intent intent = new Intent(pagina_principal.this, descripcion.class);
                startActivity(intent);
            }
        });//*/
    }
    public void llenaEjemplosHTML(){
        MyAdapter adapter=new MyAdapter (getApplicationContext(),ejemplosHTML,idEjemplos);
        listaEjemplosHTML.setAdapter(adapter);
        listaEjemplosHTML.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i,long l){
                Intent intent = new Intent(pagina_principal.this, descripcion.class);
                startActivity(intent);
            }
        });//*/
    }
    public void llenaEjemplosJS(){
        MyAdapter adapter=new MyAdapter (getApplicationContext(),ejemplosJS,idEjemplos);
        listaEjemplosJS.setAdapter(adapter);
        listaEjemplosJS.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i,long l){
                Intent intent = new Intent(pagina_principal.this, descripcion.class);
                startActivity(intent);
            }
        });//*/
    }
    public void llenaEjemplosJQuery(){
        MyAdapter adapter=new MyAdapter (getApplicationContext(),ejemplosJQUERY,idEjemplos);
        listaEjemplosJQuery.setAdapter(adapter);
        listaEjemplosJQuery.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i,long l){
                Intent intent = new Intent(pagina_principal.this, descripcion.class);
                startActivity(intent);
            }
        });//*/
    }
}


//clase my adapter

/*class MyAdapter extends ArrayAdapter {
    int[] ID;
    String[] nombre;

    public MyAdapter(Context context, String[] nombre, int[] id){
        super(context, R.layout.itemlista, R.id.textoItem, nombre);

        this.nombre=nombre;
        this.ID=id;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater= (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.itemlista,parent,false);


        TextView thisTexto = (TextView) row.findViewById(R.id.textoItem);

        thisTexto.setText(this.nombre[position]);//

        View view = super.getView(position, convertView, parent);
        return row;
    }
    public void mensaje (String r) {
        //Toast.makeText(getApplicationContext(), r, Toast.LENGTH_SHORT).show();
    }
}//*/