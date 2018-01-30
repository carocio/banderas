package com.wordpress.clarahcom.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText numero1 = findViewById(R.id.editText3);
        final EditText numero2 = findViewById(R.id.editText4);
        Button sumar = findViewById(R.id.button3);
        Button restar = findViewById(R.id.button4);
        Button multiplicar = findViewById(R.id.button5);
        Button dividir = findViewById(R.id.button6);
        final TextView resultado = findViewById(R.id.textView2);
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.valueOf(numero1.getText().toString());
                int y = Integer.valueOf(numero2.getText().toString());
                int r = x+y;
                resultado.setText(String.valueOf(r));

            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.valueOf(numero1.getText().toString());
                int y = Integer.valueOf(numero2.getText().toString());
                int r = x-y;
                resultado.setText(String.valueOf(r));
            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.valueOf(numero1.getText().toString());
                int y = Integer.valueOf(numero2.getText().toString());
                int r = x*y;
                resultado.setText(String.valueOf(r));
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.valueOf(numero1.getText().toString());
                int y = Integer.valueOf(numero2.getText().toString());
                int r = x/y;
                resultado.setText(String.valueOf(r));
            }
        });
    }
}
