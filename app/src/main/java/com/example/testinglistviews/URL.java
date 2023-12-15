package com.example.testinglistviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class URL extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        Button ok = findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText entry = findViewById(R.id.entry);
                if(!entry.getText().equals("")) {
                    String url = String.valueOf(entry.getText());
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                }else{
                    Toast.makeText(URL.this, "Primero Rellena el campo", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}