package com.example.leal.evidencia2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.leal.evidencia2.models.usuario;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void enviarclick(View view)
    {

        usuario a = new usuario();
        a.nombre = ((EditText)findViewById(R.id.nombretext)).getText().toString();
        a.primapellido = ((EditText)findViewById(R.id.apellidotext)).getText().toString();
        a.segapellido = ((EditText)findViewById(R.id.apellido2text)).getText().toString();
        a.fecha = ((EditText)findViewById(R.id.fecha2)).getText().toString();
        a.entidad = ((Spinner)findViewById(R.id.spinner2)).getSelectedItem().toString();
        a.sexo = ((RadioButton)findViewById(((RadioGroup)findViewById(R.id.radioGroup2)).getCheckedRadioButtonId())).getText().toString();

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra( "user", a);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.cerrar_sesion:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

