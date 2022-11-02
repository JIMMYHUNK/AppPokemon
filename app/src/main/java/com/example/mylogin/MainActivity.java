package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Register;
    EditText Usuario,Contraseña;
    Button Iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Usuario = findViewById(R.id.Usuario);
        Contraseña = findViewById(R.id.Contraseña);
        Iniciar = findViewById(R.id.Iniciar);

        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Usuario.getText().toString().equals("Usuario") && Contraseña.getText().toString().equals("123") )
                {
                    //Intent intent = new Intent( MainActivity.this,Principal.class);
                    startActivity(new Intent(MainActivity.this,Principal.class));
                    Toast.makeText(MainActivity.this, "Todo esta ok", Toast.LENGTH_LONG).show();
                }else
                {
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_LONG).show();
                }
            }
        });

        Register = (Button) findViewById(R.id.Register2);
        Register.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Register.class);
                startActivity(i);


            }
        });
    }
}

