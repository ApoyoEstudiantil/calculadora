package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    Button Sumando, Restando, Dividiendo, Multiplicando;
    Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,zero;
    Button  Borrar, Punto, Igual;
    TextView Resultado, Almacen;
    double resultado;
    String operador, mostrar, reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        Sumando = (Button) findViewById(R.id.bmas);
        Restando = (Button) findViewById(R.id.bmen);
        Dividiendo = (Button) findViewById(R.id.bdiv);
        Multiplicando = (Button) findViewById(R.id.bmul);
        uno =(Button) findViewById(R.id.b1);
        dos = (Button) findViewById(R.id.b2);
        tres = (Button) findViewById(R.id.b3);
        cuatro = (Button) findViewById(R.id.b4);
        cinco = (Button)findViewById(R.id.b5);
        seis = (Button) findViewById(R.id.b6);
        siete = (Button) findViewById(R.id.b7);
        ocho = (Button) findViewById(R.id.b8);
        nueve = (Button) findViewById(R.id.b9);
        zero = (Button) findViewById(R.id.bzero);
        Borrar = (Button) findViewById(R.id.borrar);
        Punto = (Button) findViewById(R.id.punto);
        Igual = (Button) findViewById(R.id.bigual);
        Resultado= (TextView)findViewById(R.id.Enum);
        Almacen = (TextView)findViewById(R.id.Enu);


        uno.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado .setText(mostrar);

            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                mostrar = Resultado .getText().toString();
                mostrar = mostrar + "2";
                Resultado .setText(mostrar);

            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                mostrar = Resultado .getText().toString();
                mostrar = mostrar + "3";
                Resultado .setText(mostrar);
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                mostrar = Resultado .getText().toString();
                mostrar = mostrar + "4";
                Resultado .setText(mostrar);
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                mostrar = Resultado .getText().toString();
                mostrar = mostrar + "5";
                Resultado .setText(mostrar);
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                mostrar = Resultado .getText().toString();
                mostrar = mostrar + "6";
                Resultado .setText(mostrar);
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                mostrar = Resultado .getText().toString();
                mostrar = mostrar + "7";
                Resultado .setText(mostrar);
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                mostrar = Resultado .getText().toString();
                mostrar = mostrar + "8";
                Resultado .setText(mostrar);
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                mostrar = Resultado .getText().toString();
                mostrar = mostrar + "9";
                Resultado .setText(mostrar);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                mostrar = Resultado .getText().toString();
                mostrar = mostrar + "0";
                Resultado .setText(mostrar);
            }
        });
        Sumando.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                reserva = Resultado .getText().toString();
                operador = "+";
                Resultado .setText("");


            }
        });
        Restando.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                reserva = Resultado .getText().toString();
                operador = "-";
                Resultado .setText("");

            }
        });
        Multiplicando.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                reserva = Resultado .getText().toString();
                operador = "*";
                Resultado .setText("");
            }
        });
        Dividiendo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                reserva = Resultado .getText().toString();
                operador = "/";
                Resultado .setText("");
            }
        });
        Punto.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                reserva = Resultado .getText().toString();
                operador = ".";
                Resultado .setText("");
            }
        });
        Borrar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                mostrar = Resultado .getText().toString();
                mostrar = mostrar.substring(0,mostrar.length()-1);
                Resultado .setText(mostrar);

            }
        });
        Igual.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                mostrar = Resultado .getText().toString();
                Almacen.setText(reserva+operador);
                mostrar = mostrar + "1";

                if (operador.equals("-")){

                    resultado = Double.parseDouble(reserva ) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if (operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if (operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if (operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
            }
        });

    }
}