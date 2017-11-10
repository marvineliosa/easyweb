package com.easyweb.marvin.easyweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

import org.w3c.dom.Text;

public class descripcion extends AppCompatActivity {
    TabHost tab;
    TextView txtNombreEtiqueta;
    TextView txtDescripcionEtiqueta;
    TextView txtSintaxisEtiqueta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        tab = (TabHost) findViewById(R.id.tabDescripcion);
        txtNombreEtiqueta = (TextView) findViewById(R.id.txtNombreEtiqueta);
        txtDescripcionEtiqueta = (TextView) findViewById(R.id.txtDescripcionEtiqueta);
        txtSintaxisEtiqueta = (TextView) findViewById(R.id.txtSintaxisEtiqueta);

        txtNombreEtiqueta.setText("<p>...</p>");
        txtDescripcionEtiqueta.setText("Esta etiqueta añade un parrafo con el texto añadido dentro de las etiquetas.");
        txtSintaxisEtiqueta.setText("<p>Esto es un parrafo</p>");
        tab.setup();
        TabHost.TabSpec ts1 = tab.newTabSpec("tsDescripcion");
        ts1.setIndicator("Descripcion");
        ts1.setContent(R.id.tab1);
        tab.addTab(ts1);

        TabHost.TabSpec ts2 = tab.newTabSpec("tsResultado");
        ts2.setIndicator("Resultado");
        ts2.setContent(R.id.tab2);
        tab.addTab(ts2);
    }


}
