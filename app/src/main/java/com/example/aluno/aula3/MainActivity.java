package com.example.aluno.aula3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Peso;
    TextView Altura;
    TextView IMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Peso = (TextView) findViewById(R.id.Peso);
        Altura = (TextView) findViewById(R.id.Altura);
        IMC = (TextView) findViewById(R.id.IMC);
    }

    public void CalcularIMC(View view) {
        double altura, peso;

        altura = Double.parseDouble(Peso.getText().toString());
        peso =  Double.parseDouble(Altura.getText().toString());

        IMC.setText("IMC: "+Double.toString(peso/(altura*altura)));
    }
}
