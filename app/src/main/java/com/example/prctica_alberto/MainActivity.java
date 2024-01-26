package com.example.prctica_alberto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.EditText;
import android.widget.Button;git remote set-url origin https://github.com/AlbertoR2002/ExamenPractico2.git
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText primerParcialEditText = findViewById(R.id.primer_parcial);
        EditText segundoParcialEditText = findViewById(R.id.segundo_parcial);
        EditText promedioEditText = findViewById(R.id.promedio);
        Button calcularButton = findViewById(R.id.calcular);

        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float primerParcial = Float.parseFloat(primerParcialEditText.getText().toString());
                float segundoParcial = Float.parseFloat(segundoParcialEditText.getText().toString());
                float promedio = (primerParcial + segundoParcial) / 2;
                promedioEditText.setText(String.valueOf(promedio));
            }
        });
    }
}