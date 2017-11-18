package com.easyweb.marvin.easyweb;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by marvin on 17/11/2017.
 */

public class tab_ejemplos extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_ejemplos, container, false);
        //listaInicio = (ListView) rootView.findViewById(R.id.listaInicio);
        return rootView;
    }



}
