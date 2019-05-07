package com.example.mika.promedio;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PromedioActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;
    private Button btn;

    InputMethodManager imm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);

        imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        tv1 = (TextView) findViewById(R.id.tv1);
        btn = (Button) findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                promedio(view);
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
            }
        });
    }

    public void promedio(View view)
    {
        float v1,v2,v3;

        if(et1.getText().toString().isEmpty())
        {
            v1=0; et1.setText("0");
        }
        else
            v1 = Integer.parseInt(et1.getText().toString());

        if(et2.getText().toString().isEmpty())
        {
            v2=0;
            et2.setText("0");
        }
        else
            v2 = Integer.parseInt(et2.getText().toString());

        if(et3.getText().toString().isEmpty())
        {
            v3=0;
            et3.setText("0");
        }
        else
            v3 = Integer.parseInt(et3.getText().toString());

        float promedio = (v1 + v2 + v3) / 3;

        String resultado = String.valueOf(promedio);

        tv1.setText(resultado);
    }
}
