package com.example.sisa.location;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button enterButton;
    EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        enterButton = (Button) findViewById(R.id.enter_btn);
        nameEditText = (EditText) findViewById(R.id.name_text_edit);
        enterButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = nameEditText.getText().toString();
        if (v.getId() == enterButton.getId() && !name.isEmpty()) {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("KeyName", nameEditText.getText().toString());
            startActivity(intent);

        } else {
            nameEditText.setError("text");
        }
    }
}
