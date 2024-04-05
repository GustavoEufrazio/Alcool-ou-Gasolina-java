package com.gustavoeufrazio.alcoolougasolinajava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view){
        EditText alcool = findViewById(R.id.txtAlcool);
        double valorAlcool =Double.parseDouble(alcool.getText().toString());
        EditText gasolina = findViewById(R.id.txtGasolina);
        double valorGasolina = Double.parseDouble(String.valueOf(gasolina.getText()));
        TextView txtResultado = findViewById(R.id.txtResultado);
        if(valorAlcool/valorGasolina <= 0.7){
            txtResultado.setText("Alcool é mais recomendado");
        }else{
            txtResultado.setText("Gasolina é mais recomendado");
        }
    }
}