package com.example.examenparcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_a,et_b,et_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_a=(EditText)findViewById(R.id.TCuadratico);
        et_b=(EditText)findViewById(R.id.TLineal);
        et_c=(EditText)findViewById(R.id.TIndependiente);



    }




    public void calcular(View calcular) {

        if (validar()){



        int a,b,c;
        a=Integer.parseInt(et_a.getText().toString());
        b=Integer.parseInt(et_b.getText().toString());
        c=Integer.parseInt(et_c.getText().toString());

        float resultado_raiz=0,resultado1=0,resultado2=0;
        int suma_dentro_raiz=(b*b)-4*a*c;
        resultado_raiz=(float)Math.sqrt(suma_dentro_raiz);

        if(suma_dentro_raiz<=0){
            Toast.makeText(this,"No se puede ralizar la raiz es negativa RESULTADO: ",Toast.LENGTH_SHORT).show();

        }else if(suma_dentro_raiz>=1){


            resultado1=(-1*b+(resultado_raiz))/(2*a);
            resultado2=(-1*b-(resultado_raiz))/(2*a);


            String parseo1,parseo2,parseo3;
            parseo1=String.valueOf(resultado1);
            parseo2=String.valueOf(resultado2);

            Toast.makeText(this,"x1 = " +parseo1 +" x2="+parseo2,Toast.LENGTH_SHORT).show();

        }





        }
    }

    public boolean validar(){
        boolean retorno=true;
        String C1,C2,C3;
        C1=et_a.getText().toString();
        C2=et_b.getText().toString();
        C3=et_c.getText().toString();

        if(C1.isEmpty()){

            et_a.setError("Este campo A no puede quedar vacio");
            retorno=false;
        }
        if(C2.isEmpty()){
            et_b.setError("Este campo B no puede quedar vacio");
            retorno=false;
        }
        if(C3.isEmpty()){
            et_c.setError("Este campo C no puede quedar vacio");
            retorno=false;
        }



        return retorno;
    }




}