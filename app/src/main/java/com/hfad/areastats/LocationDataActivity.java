package com.hfad.areastats;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class LocationDataActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_data);

        retrieveData();
    }

    private void retrieveData() {
        TextView textViewUnemploymentRate = (TextView)findViewById(R.id.generalPopulation_UnemploymentRate);
        String unemploymentRate = textViewUnemploymentRate.getText().toString() + 3.53 + "%";
        textViewUnemploymentRate.setText(unemploymentRate);
    }
}
