package com.example.whowantstobeamillionaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Won extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_won);

        Toast.makeText(Won.this, "You've won. Thank you for playing", Toast.LENGTH_LONG).show();
    }
}
