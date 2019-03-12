package com.example.a01b_boton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button button;
    public TextView textView;

    public boolean cambio = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cambio) {
                    textView.setText("¡Hola Mundo!");
                    textView.setTextColor(Color.RED);
                    textView.setTextSize(20);
                }
                else
                {
                    textView.setText("Hello World!");
                    textView.setTextColor(Color.BLACK);
                    textView.setTextSize(10);
                }
                cambio = !cambio;
            }
        });
    }
}
