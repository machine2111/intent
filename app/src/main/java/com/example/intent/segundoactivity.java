package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class segundoactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundoactivity);
    }

    //Metodo el boton anterior
    public void Anterior(View view) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}