package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Locale;

public class Contacto extends AppCompatActivity {
    private TextView tvDateText;
    private TextView tvName;
    private TextView tvEmail;
    private TextView tvTelefono;
    private TextView tvDireccion;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        tvDateText = (TextView) findViewById(R.id.tvDate);
        tvName = (TextView) findViewById(R.id.tvNombre);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvDireccion = (TextView) findViewById(R.id.tvDireccion);
        button = (Button) findViewById(R.id.btnAceptar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Contacto.this, MainActivity.class);
                startActivity(intent);
            }
        });
        mostrarDatos();
    }

    private void mostrarDatos() {
        Bundle datos = this.getIntent().getExtras();
        String nameI = datos.getString("nombre");
        String emailI = datos.getString("email");
        String telefonoI = datos.getString("telefono");
        String dateI = datos.getString("fecha");
        String direccionn = datos.getString("direccion");

        tvName.setText(nameI);
        tvEmail.setText(emailI);
        tvTelefono.setText(telefonoI);
        tvDateText.setText(dateI);
        tvDireccion.setText(direccionn);


    }
}