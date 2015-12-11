package com.example.sisa.airpromobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;
import android.support.v7.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.widget.Toolbar toolbar=(android.support.v7.widget.Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }
}
