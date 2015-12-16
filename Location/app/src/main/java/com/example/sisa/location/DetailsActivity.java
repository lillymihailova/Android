package com.example.sisa.location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ageEditText;
    EditText addressEditText;
    EditText cityEditText;
    EditText dateOfBirthET;
    Button forwordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        forwordButton = (Button) findViewById(R.id.forword_btn);
        forwordButton.setOnClickListener(this);
        ageEditText = (EditText) findViewById(R.id.years_text_edit);
        addressEditText = (EditText) findViewById(R.id.address_text_edit);
        cityEditText = (EditText) findViewById(R.id.city_text_edit);
        dateOfBirthET = (EditText) findViewById(R.id.dateOfBirth_text_edit);
        String name = getIntent().getStringExtra("KeyName");


    }

    @Override
    public void onClick(View v) {
        String age = ageEditText.getText().toString();
        String address = addressEditText.getText().toString();
        String city = cityEditText.getText().toString();
        String dateOfBirth = dateOfBirthET.getText().toString();
        String name = getIntent().getStringExtra("KeyName");
        if (v.getId() == forwordButton.getId() && age.isEmpty()) {
            ageEditText.setError("text");

        } else if (v.getId() == forwordButton.getId() && address.isEmpty()) {
            addressEditText.setError("text");
        } else if (v.getId() == forwordButton.getId() && city.isEmpty()) {
            cityEditText.setError("text");
        } else if (v.getId() == forwordButton.getId() && dateOfBirth.isEmpty()) {
            dateOfBirthET.setError("text");
        } else if (v.getId() == forwordButton.getId() && (!age.isEmpty() || !address.isEmpty() || !city.isEmpty() || dateOfBirth.isEmpty())) {
            Intent intent = new Intent(this, SummaryActivity.class);
            intent.putExtra("KeyName1", name);
            intent.putExtra("KeyAge", ageEditText.getText().toString());
            intent.putExtra("KeyAddress", addressEditText.getText().toString());
            intent.putExtra("KeyCity", cityEditText.getText().toString());
            startActivity(intent);
        }
    }
}
