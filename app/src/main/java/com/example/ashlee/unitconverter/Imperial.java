package com.example.ashlee.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.ashlee.unitconverter.R.id.result;
import static com.example.ashlee.unitconverter.R.id.spinnerSelect1;
import static com.example.ashlee.unitconverter.R.id.submitButton;
import static com.example.ashlee.unitconverter.R.id.valueToConvert;

public class Imperial extends AppCompatActivity {

    private TextView secondResult;
    private EditText secondValueToConvert;
    private Spinner secondSpinnerSelect1;
    private Spinner secondSpinnerSelect2;
    public Button secondDubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_settings);

        secondResult = (TextView) findViewById(result);
        secondValueToConvert = (EditText) findViewById(valueToConvert);
        secondSpinnerSelect1 = (Spinner) findViewById(spinnerSelect1);
        secondSpinnerSelect2 = (Spinner) findViewById(R.id.spinnerSelect2);
        secondDubmitButton = (Button) findViewById(submitButton);
        secondResult.setText("");

        secondDubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = Double.parseDouble(secondValueToConvert.getText().toString());

                boolean spinnerKM = secondSpinnerSelect2.getSelectedItem().toString().equals("Kilometer (km)");
                boolean spinnerCM = secondSpinnerSelect2.getSelectedItem().toString().equals("Centimeter (cm)");
                boolean spinnerMM = secondSpinnerSelect2.getSelectedItem().toString().equals("Millimeter (mm)");

                boolean spinnerMI = secondSpinnerSelect1.getSelectedItem().toString().equals("Miles");
                boolean spinnerFE = secondSpinnerSelect1.getSelectedItem().toString().equals("Feet");
                boolean spinnerIN = secondSpinnerSelect1.getSelectedItem().toString().equals("Inches");

                //Conversion between Imperial to Metric
                if(spinnerMI && spinnerKM){
                    double convertedValue = value * 1.60934;
                    secondResult.setText(Double.toString(convertedValue) + " km");
                }

                if(spinnerMI && spinnerCM){
                    double convertedValue = value * 160934;
                    secondResult.setText(Double.toString(convertedValue) + " cm");
                }

                if(spinnerMI && spinnerMM){
                    double convertedValue = value * 1.609e+6;
                    secondResult.setText(Double.toString(convertedValue) + " mm");
                }

                if(spinnerFE && spinnerKM){
                    double convertedValue = value * 0.0003048;
                    secondResult.setText(Double.toString(convertedValue) + " km");
                }

                if(spinnerFE&& spinnerCM){
                    double convertedValue = value * 30.48;
                    secondResult.setText(Double.toString(convertedValue) + " cm");
                }

                if(spinnerFE && spinnerMM){
                    double convertedValue = value * 304.8;
                    secondResult.setText(Double.toString(convertedValue) + " mm");
                }

                if(spinnerIN && spinnerKM){
                    double convertedValue = value * 2.54e-5;
                    secondResult.setText(Double.toString(convertedValue) + " km");
                }

                if(spinnerIN && spinnerCM){
                    double convertedValue = value * 2.54;
                    secondResult.setText(Double.toString(convertedValue) + " cm");
                }

                if(spinnerIN && spinnerMM){
                    double convertedValue = value * 25.4;
                    secondResult.setText(Double.toString(convertedValue) + " mm");
                }

            }
        });
    }

    public void metricScreen(View view) {
        Intent startMainActivity = new Intent(this, MainActivity.class);
        startActivity(startMainActivity);
    }

}