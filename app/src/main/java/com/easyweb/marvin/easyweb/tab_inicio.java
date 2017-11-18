package com.easyweb.marvin.easyweb;

/**
 * Created by marvin on 17/11/2017.
 */
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class tab_inicio extends Fragment{

    ListView listaInicio;

    int[] idNombre = {1,2,3};
    int[] idEjemplos = {1,2,3,4,5};
    String[] nombre = {"¿Que es HTML?","¿Que es JavaScript?","Modelo Cliente - Servidor"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_inicio, container, false);
        listaInicio = (ListView) rootView.findViewById(R.id.listaInicio);
        llenaListaInicio();
        return rootView;
    }

    public void llenaListaInicio(){
        MyAdapter adapter=new MyAdapter (getContext(),nombre,idNombre);
        listaInicio.setAdapter(adapter);
        /*listaInicio.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i,long l){
                Intent intent = new Intent(pagina_principal.this, descripcion.class);
                startActivity(intent);
            }
        });//*/
    }
}




