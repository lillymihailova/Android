package com.example.sisa.location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity implements View.OnClickListener {
    Button mapButton;
    TextView dataView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        mapButton = (Button) findViewById(R.id.card_btn);
        mapButton.setOnClickListener(this);
        dataView = (TextView) findViewById(R.id.data_view);
        String name = getIntent().getStringExtra("KeyName1");
        String age = getIntent().getStringExtra("KeyAge");
        String address = getIntent().getStringExtra("KeyAddress");
        String city = getIntent().getStringExtra("KeyCity");
        dataView.setText(name + ","+"\n" + age +"г." +","+"\n" + address + ","+"\n"+"гр. " + city);

    }

    @Override
    public void onClick(View v) {
        String address = getIntent().getStringExtra("KeyAddress");
        String city = getIntent().getStringExtra("KeyCity");
        if (v.getId() == mapButton.getId()) {
            Intent intent = new Intent(this, MapsActivity.class);
            intent.putExtra("KeyMap1", address);
            intent.putExtra("KeyMap2", city);
            startActivity(intent);
        }
    }
}
