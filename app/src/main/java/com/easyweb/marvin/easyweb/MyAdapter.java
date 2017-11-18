package com.easyweb.marvin.easyweb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by marvin on 17/11/2017.
 */

class MyAdapter extends ArrayAdapter {
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

        thisTexto.setText(this.nombre[position]);//*/

        View view = super.getView(position, convertView, parent);
        return row;
    }
    public void mensaje (String r) {
        //Toast.makeText(getApplicationContext(), r, Toast.LENGTH_SHORT).show();
    }
}
