package com.example.mika.operaciones;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class OperacionesActivity extends AppCompatActivity {

    //Creo las variables con los nombres de los ids de los objetos
    public EditText texto1, texto2;
    public RadioButton sumar, restar;
    public Button calcular;
    public TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        //Relaciono las variables con los objetos
        texto1 = (EditText) findViewById(R.id.texto1);
        texto2 = (EditText) findViewById(R.id.texto2);
        sumar = (RadioButton) findViewById(R.id.sumar);
        restar = (RadioButton) findViewById(R.id.restar);
        calcular = (Button) findViewById(R.id.calcular);
        resultado = (TextView) findViewById(R.id.resultado);

        //Creo la función del click del botón
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Declaro las variables
                int valor1, valor2, res;

                //Obtengo los valores de los edit text
                if(texto1.getText().toString().isEmpty()) //Si está vacío
                {
                    valor1 = 0;
                    texto1.setText("0");
                }
                else
                    valor1 = Integer.parseInt(texto1.getText().toString());

                if(texto2.getText().toString().isEmpty()) //Si está vacío
                {
                    valor2 = 0;
                    texto2.setText("0");
                }
                else
                    valor2 = Integer.parseInt(texto2.getText().toString());
                
                
                if(sumar.isChecked())
                {
                    res = valor1 + valor2;
                    resultado.setText(String.valueOf(res).toString());
                }
                if(restar.isChecked())
                {
                    res = valor1 - valor2;
                    resultado.setText(String.valueOf(res).toString());
                }
            }
        });

    }
}
