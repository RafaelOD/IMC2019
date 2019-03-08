package com.example.aluno.aula3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Peso;
    TextView Altura;
    TextView IMC;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Peso = (TextView) findViewById(R.id.Peso);
        Altura = (TextView) findViewById(R.id.Altura);
        IMC = (TextView) findViewById(R.id.IMC);
        img = (ImageView) findViewById(R.id.Img);
        img.setImageResource(R.mipmap.perfil);
    }

    public void CalcularIMC(View view) {
        double altura, peso,r;

        altura = Double.parseDouble(Peso.getText().toString());
        peso =  Double.parseDouble(Altura.getText().toString());
        r = peso/(altura*altura)
        IMC.setText("IMC: "+Double.toString(r));



        if(r<=18.5){
            img.setImageResource(R.mipmap.abaixopeso);
        }else if(r>=18.6 & r<=24.9){
            img.setImageResource(R.mipmap.normal);

        }else if(r>=25 & r<=29.9){
            img.setImageResource(R.mipmap.sobrepeso);

        }else if(r>=30 & r<=34.9){
            img.setImageResource(R.mipmap.obesidade1);

        }else if(r>=35 & r<=39.9){
            img.setImageResource(R.mipmap.obesidade2);
        }else if(r>=40){
            img.setImageResource(R.mipmap.obesidade3);
        }


    }
}
