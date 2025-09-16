package com.example.provaapp;

import android.annotation.SuppressLint;
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

public class calculodoisActivity extends AppCompatActivity {
    private EditText KM;
    private EditText ML;
    private Button calcularKM;
    private Button calculcarML;
    private Button voltar;
    private TextView resultado1;
    private TextView resultado2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculodois);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        KM = findViewById(R.id.kmId);
        ML = findViewById(R.id.milhaId);
        calcularKM = findViewById(R.id.KMbutton);
        calculcarML = findViewById(R.id.MLbutton);
        resultado1 = findViewById(R.id.resultKM);
        resultado2 = findViewById(R.id.resultML);
        voltar = findViewById(R.id.voltarButton);

        calcularKM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = KM.getText().toString();
                if (valor1.isEmpty()) {
                    resultado1.setText("Informe o numero para o calculo!");
                } else {
                    double KM = Double.parseDouble(valor1);
                    resultado1.setText("Resultado: " + (KM / 1.609));
                }
            }
        });
        calculcarML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor2 = ML.getText().toString();
                if (valor2.isEmpty()) {
                    resultado2.setText("Informe o numero para o calculo!");
                } else {
                    double ML = Double.parseDouble(valor2);
                    resultado2.setText("Resultado: " + (ML * 1.609));
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