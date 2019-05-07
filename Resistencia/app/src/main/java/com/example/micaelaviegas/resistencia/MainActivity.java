package com.example.micaelaviegas.resistencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText EditValor1, EditValor2;
    public Button Boton1, Boton2;
    public TextView Serie, Paralelo, Resisitencia;
    public Spinner Color1, Color2, Color3;
    public double Valor1, Valor2, Output, MultColor, ResColor;
    public String Banda1, Banda2;
    public int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditValor1 = (EditText) findViewById(R.id.EditValor1);
        EditValor2 = (EditText) findViewById(R.id.EditValor2);
        Color1 = (Spinner) findViewById(R.id.Color1);
        Color2 = (Spinner) findViewById(R.id.Color2);
        Color3 = (Spinner) findViewById(R.id.Color3);

        Boton1 = (Button) findViewById(R.id.Boton1);
        Boton2 = (Button) findViewById(R.id.Boton2);

        Serie = (TextView) findViewById(R.id.Serie);
        Paralelo = (TextView) findViewById(R.id.Paralelo);
        Resisitencia = (TextView) findViewById(R.id.Resistencia);

        Boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Valor1 = Double.valueOf(EditValor1.getText().toString());
                Valor2 = Double.valueOf(EditValor2.getText().toString());

                Output = Valor1 + Valor2;
                Serie.setText(String.valueOf(Output));

                Output = 1 / ( 1/Valor1 + 1/Valor2 );
                Paralelo.setText(String.valueOf(Output));
            }
        });

        Color1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Banda1=String.valueOf(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Color2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Banda2=String.valueOf(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Color3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                MultColor=1;
                for(i=0;i<position-1;i++)
                {
                    MultColor=MultColor*10;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ResColor=Double.valueOf(Banda1+Banda2)*MultColor;
                Resisitencia.setText(String.valueOf(ResColor));
            }
        });
    }
}
