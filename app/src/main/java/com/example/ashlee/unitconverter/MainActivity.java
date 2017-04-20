package com.example.ashlee.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText valueToConvert;
    private Spinner spinnerSelect1;
    private Spinner spinnerSelect2;
    public Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        result = (TextView) findViewById(R.id.result);
        valueToConvert = (EditText) findViewById(R.id.valueToConvert);
        spinnerSelect1 = (Spinner) findViewById(R.id.spinnerSelect1);
        spinnerSelect2 = (Spinner) findViewById(R.id.spinnerSelect2);
        submitButton = (Button) findViewById(R.id.submitButton);
        result.setText("");

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = Double.parseDouble(valueToConvert.getText().toString());

                boolean spinnerKM = spinnerSelect1.getSelectedItem().toString().equals("Kilometre (km)");
                boolean spinnerM = spinnerSelect1.getSelectedItem().toString().equals("Metre (m)");
                boolean spinnerCM = spinnerSelect1.getSelectedItem().toString().equals("Centimetre (cm)");
                boolean spinnerMM = spinnerSelect1.getSelectedItem().toString().equals("Millimetre (mm)");


                boolean spinnerMI = spinnerSelect2.getSelectedItem().toString().equals("Miles");
                boolean spinnerY = spinnerSelect2.getSelectedItem().toString().equals("Yards");
                boolean spinnerFE = spinnerSelect2.getSelectedItem().toString().equals("Feet");
                boolean spinnerIN = spinnerSelect2.getSelectedItem().toString().equals("Inches");


                //Converting Kilometres
                if (spinnerKM && spinnerMI) {
                    double convertedValue = value * 0.62;
                    result.setText(Double.toString(convertedValue) + " miles");
                }

                if (spinnerKM && spinnerY) {
                    double convertedValue = value * 1093.61;
                    result.setText(Double.toString(convertedValue) + " yards");
                }

                if (spinnerKM && spinnerFE) {
                    double convertedValue = value * 3280.84;
                    result.setText(Double.toString(convertedValue) + " feet");
                }

                if (spinnerKM && spinnerIN) {
                    double convertedValue = value * 39370.0787;
                    result.setText(Double.toString(convertedValue) + " inches");
                }

                //Converting Metres
                if (spinnerM && spinnerMI) {
                    double convertedValue = value * 0.000621371;
                    result.setText(Double.toString(convertedValue) + " miles");
                }

                if (spinnerM && spinnerY) {
                    double convertedValue = value * 1.09361;
                    result.setText(Double.toString(convertedValue) + " yards");
                }

                if (spinnerM && spinnerFE) {
                    double convertedValue = value * 3.28084;
                    result.setText(Double.toString(convertedValue) + " feet");
                }

                if (spinnerM && spinnerIN) {
                    double convertedValue = value * 39.3701;
                    result.setText(Double.toString(convertedValue) + " inches");
                }

                //Converting Centimetres
                if (spinnerCM && spinnerMI) {
                    double convertedValue = value * 6.2137e-6;
                    result.setText(Double.toString(convertedValue) + " miles");
                }

                if (spinnerCM && spinnerY) {
                    double convertedValue = value * 0.0109361;
                    result.setText(Double.toString(convertedValue) + " yards");
                }

                if (spinnerCM && spinnerFE) {
                    double convertedValue = value * 0.0328084;
                    result.setText(Double.toString(convertedValue) + " feet");
                }

                if (spinnerCM && spinnerIN) {
                    double convertedValue = value * 0.393701;
                    result.setText(Double.toString(convertedValue) + " inches");
                }

                //Converting Millimetres
                if (spinnerMM && spinnerMI) {
                    double convertedValue = value * 6.213712121212e-7;
                    result.setText(Double.toString(convertedValue) + " miles");
                }

                if (spinnerMM && spinnerY) {
                    double convertedValue = value * 0.00109361;
                    result.setText(Double.toString(convertedValue) + " yards");
                }

                if (spinnerMM && spinnerFE) {
                    double convertedValue = value * 0.00328084;
                    result.setText(Double.toString(convertedValue) + " feet");
                }

                if (spinnerMM && spinnerIN) {
                    double convertedValue = value * 0.0393701;
                    result.setText(Double.toString(convertedValue) + " inches");
                }

            }
        });
    }

    /**
     * Called when the user taps the settings button
     */

    public void settingsScreen(View view) {
        Intent startSettingsActivity = new Intent(this, ChangeSettingsActivity.class);
        startActivity(startSettingsActivity);
    }


}
