package com.example.testinglistviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class Hora extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);
        Button btn= findViewById(R.id.button2);
        btn.setOnClickListener(this);
        updateTime(getCurrentFocus());
    }

    private void updateTime(View v) {
        TextView textview = findViewById(R.id.textView);
        textview.setText(new Date().toString());
    }

    @Override
    public void onClick(View v) {
        updateTime(v);
    }
}