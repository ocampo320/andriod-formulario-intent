package com.example.formulario;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    private TextView dateText;
    private EditText name;
    private EditText email;
    private EditText telefono;
    private EditText direccion;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateText = findViewById(R.id.txv_date);
        name = findViewById(R.id.et_name);
        email = findViewById(R.id.ed_email);
        telefono = findViewById(R.id.ed_telefono);
        direccion = findViewById(R.id.ed_direccion);
        button=findViewById(R.id.fab_add);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameI=name.getText().toString();
                String emailI=email.getText().toString();
                String telefonoI=telefono.getText().toString();
                String dateI=dateText.getText().toString();
                String direccionn=direccion.getText().toString();

                Intent intent= new Intent(MainActivity.this, Contacto.class);
                ObjetoContacto contacto=new ObjetoContacto(nameI,emailI,telefonoI,direccionn,dateI);
                intent.putExtra("nombre",contacto.getName());
                intent.putExtra("email",contacto.getEmail());
                intent.putExtra("telefono",contacto.getTelefono());
                intent.putExtra("direccion",contacto.getDireccion());
                intent.putExtra("fecha",contacto.getDate());
                startActivity(intent);
                System.out.println("se preciono el boton");

            }
        });

        findViewById(R.id.show_dialag).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });
    }

    public void showDatePickerDialog() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                (DatePickerDialog.OnDateSetListener) this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date = month + "/" + dayOfMonth + "/" + year;
        dateText.setText(date);
    }

}