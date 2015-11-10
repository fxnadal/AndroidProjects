package com.fxproyect.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuActivity extends Activity {

    ListViewAdapter adapter;

    //Definimos el Array
    String[] stringAccesos = new String[] {"Perfil","Juego","Instrucciones","Información"};
    int[] imagenes = {  R.drawable.icon04, R.drawable.icon03, R.drawable.icon01, R.drawable.icon02};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        //Por ultimo enchufamos el adapter al ListView
        final ListView listView =(ListView) findViewById(R.id.listView);
        adapter=new ListViewAdapter(this, stringAccesos, imagenes);
        listView.setAdapter(adapter);
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
