package com.carolinaumb.calculapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView datos;
    double n1,n2,res;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void b0 (View view){
        datos=(TextView)findViewById(R.id.pantalla);
        datos.setText(datos.getText()+"0");
    }
    public void b1 (View view){
        datos=(TextView)findViewById(R.id.pantalla);
        datos.setText(datos.getText()+"1");
    }
    public void b2 (View view){
        datos=(TextView)findViewById(R.id.pantalla);
        datos.setText(datos.getText()+"2");
    }
    public void b3 (View view){
        datos=(TextView)findViewById(R.id.pantalla);
        datos.setText(datos.getText()+"3");
    }
    public void b4 (View view){
        datos=(TextView)findViewById(R.id.pantalla);
        datos.setText(datos.getText()+"4");
    }
    public void b5 (View view){
        datos=(TextView)findViewById(R.id.pantalla);
        datos.setText(datos.getText()+"5");
    }
    public void b6 (View view){
        datos=(TextView)findViewById(R.id.pantalla);
        datos.setText(datos.getText()+"6");
    }
    public void b7 (View view){
        datos=(TextView)findViewById(R.id.pantalla);
        datos.setText(datos.getText()+"7");
    }
    public void b8 (View view){
        datos=(TextView)findViewById(R.id.pantalla);
        datos.setText(datos.getText()+"8");
    }
    public void b9 (View view){
        datos=(TextView)findViewById(R.id.pantalla);
        datos.setText(datos.getText()+"9");
    }

    public void OnClickOperacionCapturan1(View view) {
        datos=(TextView)findViewById(R.id.pantalla);
        n1=Double.parseDouble(datos.getText().toString());
        datos.setText(" ");
    }
    public void Sumar (View view){
        operador="+";
        OnClickOperacionCapturan1(view);
        }
    public void Restar (View view){
        operador="-";
        OnClickOperacionCapturan1(view);
    }
    public void Multiplicar (View view){
        operador="*";
        OnClickOperacionCapturan1(view);
    }
    public void Dividir (View view){
        operador="/";
        OnClickOperacionCapturan1(view);
    }
    public void bigual (View view){
        datos=(TextView)findViewById(R.id.pantalla);
        n2=Double.parseDouble(datos.getText().toString());
        if (operador.equals("+")){
            res=n1+n2;
        }else if (operador.equals("-")){
            res=n1-n2;
        }else if (operador.equals("*")){
            res=n1*n2;
        }else if (operador.equals("*")){
            res=n1*n2;
        }else if (operador.equals("/")){
            res=n1/n2;
        }
        datos.setText(" "+res);
    }
        public void Borrar (View view){
        if (!datos.getText().toString().equals(" ")){
            datos.setText(datos.getText().subSequence(0,datos.getText().length()-1)+" ");
        }

    }
        public void BorrarTodo (View view){
        n1=0.0;
        n2=0.0;
        datos=(TextView)findViewById(R.id.pantalla);
        datos.setText(" ");
        }
        public void Salir (View view){
        finish();
        }
}
