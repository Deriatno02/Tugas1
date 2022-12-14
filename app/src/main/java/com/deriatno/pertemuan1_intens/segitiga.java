package com.deriatno.pertemuan1_intens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segitiga extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        EditText alas = (EditText) findViewById(R.id.editTextAlas);
        EditText tinggi = (EditText) findViewById(R.id.editTextTinggi);
        Button ok = (Button) findViewById(R.id.button3);
        EditText luas = (EditText) findViewById(R.id.editTextHasil);
        
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a;
                Double b;
                double c;
                a=Double.valueOf(alas.getText().toString().trim());
                b=Double.valueOf(tinggi.getText().toString().trim());

                c = (a / 2) * b ;
                String d = String.valueOf(c);
                luas.setText(d);

            }

        });
      
    }


}