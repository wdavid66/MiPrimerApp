package com.example.miprimerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }


    //Metodo Boton Anterior

    public void Antterior(View view){
        Intent anterior = new Intent(this , MainActivity.class);
        startActivity(anterior);
    }

}
