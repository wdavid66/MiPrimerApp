package com.example.miprimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText num1,num2;
    private TextView res;
    private RadioButton rb_sumar,rb_restar,rb_multi,rb_divi;
    private CheckBox cb_suma , cb_resta , cb_multi , cb_divi;
    private Spinner spinner1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtencion de datos Basicos y Muestra de datos
        num1 = (EditText)findViewById(R.id.txt_num1);
        num2 = (EditText)findViewById(R.id.txt_num2);
        res = (TextView)findViewById(R.id.txt_resultado);

        //RadioButton
        rb_sumar =  (RadioButton)findViewById(R.id.rb_sumar);
        rb_restar =  (RadioButton)findViewById(R.id.rb_restar);
        rb_multi =  (RadioButton)findViewById(R.id.rb_multiplicar);
        rb_divi =  (RadioButton)findViewById(R.id.rb_dividir);

        //CheckBox
        cb_suma = (CheckBox)findViewById(R.id.cb_suma);
        cb_resta = (CheckBox)findViewById(R.id.cb_rest);
        cb_multi = (CheckBox)findViewById(R.id.cb_multi);
        cb_divi = (CheckBox)findViewById(R.id.cb_divi);

        //Spinner -- DropDown
        spinner1 = (Spinner)findViewById(R.id.spinner);
        String [] opciones = {"Sumar" , "Restar" , "Multiplicar" , "Dividir"};
        ArrayAdapter <String> adapter  = new ArrayAdapter<String>(this, R.layout.spinner_item_guicho, opciones);
        spinner1.setAdapter(adapter);

    }

    //Metodo del Boton
    public void calcular_sp(View view){
        String valor1_String = num1.getText().toString();
        String valor2_String = num2.getText().toString();

        int num1_int =  Integer.parseInt(valor1_String);
        int num2_int =  Integer.parseInt(valor2_String);

        String seleccion = spinner1.getSelectedItem().toString();

        if(seleccion.equals("Sumar")){
            int suma = num1_int + num2_int;
            String resultado = String.valueOf(suma);
            res.setText(resultado);
        }
        else if(seleccion.equals("Restar")){
            int rest = num1_int - num2_int;
            String resultado = String.valueOf(rest);
            res.setText(resultado);
        }
        else if(seleccion.equals("Multiplicar")){
            int multi = num1_int * num2_int;
            String resultado = String.valueOf(multi);
            res.setText(resultado);
        }
        else if(seleccion.equals("Dividir")){
            if (num2_int != 0){
                int divi = num1_int / num2_int;
                String resultado = String.valueOf(divi);
                res.setText(resultado);
            }else{
                Toast.makeText(this, "El segundo Numero debe ser diferente de 0", Toast.LENGTH_LONG).show();
            }
        }

    }

    public void calcular_rb(View view){
        String valor1_String = num1.getText().toString();
        String valor2_String = num2.getText().toString();

        int num1_int = Integer.parseInt(valor1_String);
        int num2_int = Integer.parseInt(valor2_String);

        if (rb_sumar.isChecked() == true){
            int suma = num1_int + num2_int;
            String result = String.valueOf(suma);
            res.setText(result);

        }else if(rb_restar.isChecked() == true){
            int suma = num1_int - num2_int;
            String result = String.valueOf(suma);
            res.setText(result);

        }else if(rb_multi.isChecked() == true){
            int suma = num1_int * num2_int;
            String result = String.valueOf(suma);
            res.setText(result);

        }else if(rb_divi.isChecked() == true){
            if (num2_int != 0){
                int suma = num1_int / num2_int;
                String result = String.valueOf(suma);
                res.setText(result);
            }else{
                Toast.makeText(this, "El segundo Numero debe ser diferente de 0", Toast.LENGTH_LONG).show();
            }
        }

    }

    public void calcular_cb(View view){
        String valor1_String = num1.getText().toString();
        String valor2_String = num2.getText().toString();

        int num1_int = Integer.parseInt(valor1_String);
        int num2_int = Integer.parseInt(valor2_String);

        String resultado = "";

        if (cb_suma.isChecked() == true){
            int suma = num1_int + num2_int;
            resultado = "La suma es: "+suma+" / ";

        }if(cb_resta.isChecked() == true){
            int resta = num1_int - num2_int;
            resultado = resultado +"La resta es: "+resta+" / ";

        }if(cb_multi.isChecked() == true){
            int multi = num1_int * num2_int;
            resultado = resultado +"La multiplicacion es: "+multi+" / ";

        }if(cb_divi.isChecked() == true){
            if (num2_int != 0){
                int divi = num1_int / num2_int;
                resultado = "La division es: "+divi;
            }else{
                Toast.makeText(this, "El segundo Numero debe ser diferente de 0", Toast.LENGTH_LONG).show();
            }
        }

        res.setText(resultado);

    }

    //Metodo que Realiza un Suma
    public void Sumar(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();

        int num1 =  Integer.parseInt(valor1);
        int num2 =  Integer.parseInt(valor2);

        int suma = num1 + num2;

        String result = String.valueOf(suma);

        res.setText(result);
    }

    //Metodo que Realiza una Resta
    public void Restar(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();

        int num1 =  Integer.parseInt(valor1);
        int num2 =  Integer.parseInt(valor2);

        int rest = num1 - num2;

        String result = String.valueOf(rest);

        res.setText(result);
    }

    //Metodo que Realiza un Multiplicacion
    public void Multiplicacion(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();

        int num1 =  Integer.parseInt(valor1);
        int num2 =  Integer.parseInt(valor2);

        int multi = num1 * num2;

        String result = String.valueOf(multi);

        res.setText(result);
    }

    //Metodo que Realiza una Division
    public void Division(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();

        int num1 =  Integer.parseInt(valor1);
        int num2 =  Integer.parseInt(valor2);

        int divi = num1 / num2;

        String result = String.valueOf(divi);

        res.setText(result);
    }
}
