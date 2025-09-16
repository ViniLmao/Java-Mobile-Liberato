package com.example.provaapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calculoumActivity extends AppCompatActivity {


    private EditText C;
    private EditText F;
    private Button calcularC;
    private Button calculcarF;
    private Button voltar;
    private TextView resultado1;
    private TextView resultado2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculoum);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        C = findViewById(R.id.editTextNumberDecimal);
        F = findViewById(R.id.editTextNumberDecimal3);
        calcularC = findViewById(R.id.button2);
        calculcarF = findViewById(R.id.button5);
        resultado1 = findViewById(R.id.textView6);
        resultado2 = findViewById(R.id.textView8);
        voltar = findViewById(R.id.button6);


        calcularC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = C.getText().toString();
                if (valor1.isEmpty()) {
                    resultado1.setText("Informe o numero para o calculo!");
                } else {
                    double C = Double.parseDouble(valor1);
                    resultado1.setText("Resultado: " + ((C * 9/5) + 32));
                }
            }
        });

        calculcarF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor2 = F.getText().toString();
                if (valor2.isEmpty()) {
                    F.setText("Informe o numero para o calculo!");
                } else {
                    double F = Double.parseDouble(valor2);
                    resultado2.setText("Resultado: " + ((F - 32) * 9/5));
                }
            }
        });
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}