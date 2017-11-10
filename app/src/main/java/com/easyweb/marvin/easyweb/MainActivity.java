package com.easyweb.marvin.easyweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cambio();
    }

    public void cambio(){
        //sleep();
        Intent intent = new Intent(MainActivity.this, pagina_principal.class);
        startActivity(intent);

    }
}
