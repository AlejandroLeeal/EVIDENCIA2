package com.example.leal.evidencia2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.leal.evidencia2.models.usuario;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        usuario user =intent.getParcelableExtra("user");

        ((TextView)findViewById(R.id.texto)).setText(user.primapellido);
        ((TextView)findViewById(R.id.texto1)).setText(user.segapellido);
        ((TextView)findViewById(R.id.texto2)).setText(user.nombre);
        ((TextView)findViewById(R.id.texto3)).setText(user.sexo);
        ((TextView)findViewById(R.id.texto4)).setText(user.sexoo);
        ((TextView)findViewById(R.id.texto5)).setText(user.fecha);
        ((TextView)findViewById(R.id.texto6)).setText(user.entidad);
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
