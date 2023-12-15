package com.example.testinglistviews;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.text.TextWatcher;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.EditText;

public class ButtonsOrientation extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    RadioGroup orientation;
    RadioGroup gravity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_orientation);

        orientation=(RadioGroup)findViewById(R.id.orientation);
        orientation.setOnCheckedChangeListener(this);
        gravity=(RadioGroup)findViewById(R.id.gravity);
        gravity.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.horizontal) {
            orientation.setOrientation(LinearLayout.HORIZONTAL);
        } else if (checkedId == R.id.vertical) {
            orientation.setOrientation(LinearLayout.VERTICAL);
        } else if (checkedId == R.id.left) {
            gravity.setGravity(Gravity.LEFT);
        } else if (checkedId == R.id.center) {
            gravity.setGravity(Gravity.CENTER_HORIZONTAL);
        } else if (checkedId == R.id.right) {
            gravity.setGravity(Gravity.RIGHT);
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}