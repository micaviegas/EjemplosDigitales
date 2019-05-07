package com.example.mika.holamundo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HolaMundoActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);

        tv = (TextView) findViewById(R.id.tv);

        tv.setTextColor(Color.argb(100,200,200,200));
    }
}
