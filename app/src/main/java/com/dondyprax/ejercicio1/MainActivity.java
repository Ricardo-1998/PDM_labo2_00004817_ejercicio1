package com.dondyprax.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button boton;
    private TextView texto;
    private EditText user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.boton);
        texto = findViewById(R.id.texto);
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(user.getText());
            }
        });

        boton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                texto.setText(pass.getText());
                return false;
            }
        });
    }
}
