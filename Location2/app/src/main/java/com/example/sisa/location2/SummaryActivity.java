package com.example.sisa.location2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity implements View.OnClickListener {
    Button mapButton;
    TextView dataView;
    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        mapButton = (Button) findViewById(R.id.card_btn);
        mapButton.setOnClickListener(this);
        dataView = (TextView) findViewById(R.id.data_view);
        setText();

    }

    @Override
    public void onClick(View v) {
        location = "geo:0,0?q=" + getIntent().getStringExtra("KeyAddress") + ", " + getIntent().getStringExtra("KeyCity");
        Uri gmmIntentUri = Uri.parse(location);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);


    }

    private void setText() {
        Intent intent = getIntent();
        String name = getIntent().getStringExtra("KeyName1");
        String age = getIntent().getStringExtra("KeyAge");
        String address = getIntent().getStringExtra("KeyAddress");
        String city = getIntent().getStringExtra("KeyCity");
        dataView.setText(name + "," + "\n" + age + "г." + "," + "\n" + address + "," + "\n" + "гр. " + city);

    }
}

