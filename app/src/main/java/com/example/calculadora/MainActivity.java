package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv_producto;
    Float num1 = 0.0f;
    Float num2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_producto = findViewById(R.id.tv_producto);
        //tv_producto.setText("0");
    }

    public void LimpiarResultado(View view){
        tv_producto.setText("0");
        num1 = 0.0f;
        num2 = 0.0f;
        operacion = "";
    }

    public void BorrarNumero(View view){
        String text = tv_producto.getText().toString(); tv_producto.setText(text.substring(0, text.length() - 1));
    }
    public void EscribirCero(View view){
        if(tv_producto.getText().toString().equals("0")){
            tv_producto.setText("0");
        }else{
            tv_producto.setText(tv_producto.getText() + "0");
        }
    }

    public void EscribirUno(View view){
        if(tv_producto.getText().toString().equals("0")){
            tv_producto.setText("1");
        }else{
            tv_producto.setText(tv_producto.getText() + "1");
        }
    }

    public void EscribirDos(View view){
        if(tv_producto.getText().toString().equals("0")){
            tv_producto.setText("2");
        }else{
            tv_producto.setText(tv_producto.getText() + "2");
        }
    }

    public void EscribirTres(View view){
        if(tv_producto.getText().toString().equals("0")){
            tv_producto.setText("3");
        }else{
            tv_producto.setText(tv_producto.getText() + "3");
        }
    }

    public void EscribirCuatro(View view){
        if(tv_producto.getText().toString().equals("0")){
            tv_producto.setText("4");
        }else{
            tv_producto.setText(tv_producto.getText() + "4");
        }
    }

    public void EscribirCinco(View view){
        if(tv_producto.getText().toString().equals("0")){
            tv_producto.setText("5");
        }else{
            tv_producto.setText(tv_producto.getText() + "5");
        }
    }

    public void EscribirSeis(View view){
        if(tv_producto.getText().toString().equals("0")){
            tv_producto.setText("6");
        }else{
            tv_producto.setText(tv_producto.getText() + "6");
        }
    }

    public void EscribirSiete(View view){
        if(tv_producto.getText().toString().equals("0")){
            tv_producto.setText("7");
        }else{
            tv_producto.setText(tv_producto.getText() + "7");
        }
    }

    public void EscribirOcho(View view){
        if(tv_producto.getText().toString().equals("0")){
            tv_producto.setText("8");
        }else{
            tv_producto.setText(tv_producto.getText() + "8");
        }
    }

    public void EscribirNueve(View view){
        if(tv_producto.getText().toString().equals("0")){
            tv_producto.setText("9");
        }else{
            tv_producto.setText(tv_producto.getText() + "9");
        }
    }

    public void Division(View view){
        operacion = "/";
        GuardarNumero1(view);
    }

    public void Resta(View view){
        operacion = "-";
        GuardarNumero1(view);
    }

    public void Suma(View view){
        operacion = "+";
        GuardarNumero1(view);
    }

    public void Multipli(View view){
        operacion = "*";
        GuardarNumero1(view);
    }

    public void GuardarNumero1(View view){
        num1 = Float.parseFloat(tv_producto.getText().toString());
        tv_producto.setText("0");
    }

    public void MostrarResultado(View view){
        Float result = 0.0f;
        num2 = Float.parseFloat(tv_producto.getText().toString());

        if (operacion == "+"){
            result = num1+num2;
            tv_producto.setText(result + "");
        } else if (operacion == "-") {
            result = num1-num2;
            tv_producto.setText(result + "");
        } else if (operacion == "*") {
            result = num1*num2;
            tv_producto.setText(result + "");
        } else if (operacion == "/") {
            if(num2 == 0.0f){
                tv_producto.setText("0");
                Toast.makeText(this, "OPERACION INVALIDA", Toast.LENGTH_SHORT).show();
            }else{
                result = num1 / num2;
                tv_producto.setText(result + "");
            }
        }
    }
}
