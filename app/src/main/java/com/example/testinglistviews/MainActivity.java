package com.example.testinglistviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] elementos = {"Orientacion Botones", "Hora/Fecha", "URL", "Botones Sobrepuestos", "Dialogos"};


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, elementos);


        ListView listView = findViewById(R.id.listView);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String elementoSeleccionado = elementos[position];
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, ButtonsOrientation.class);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, Hora.class);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, URL.class);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, Sobrepuesto.class);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, Dialogos.class);
                        break;
                    default:
                        intent = new Intent(MainActivity.this, MainActivity.class);
                        break;
                }

                startActivity(intent);
            }
        });
    }
}