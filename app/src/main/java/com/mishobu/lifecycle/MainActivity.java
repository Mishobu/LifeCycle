package com.mishobu.lifecycle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView txtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMensaje = (TextView) findViewById(R.id.txtMensaje);
        txtMensaje.append("\n Creado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        txtMensaje.append("\n Destruyendo");
    }

    @Override
    protected void onPause() {
        super.onPause();
        txtMensaje.append("\n Pausando");
    }

    @Override
    protected void onStop() {
        super.onStop();
        txtMensaje.append("\n Deteniendo");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        txtMensaje.append("\n Rearrancando");
    }

    @Override
    protected void onResume() {
        super.onResume();
        txtMensaje.append("\n Regresando");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
