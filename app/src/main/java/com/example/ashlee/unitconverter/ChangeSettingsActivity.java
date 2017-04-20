package com.example.ashlee.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ChangeSettingsActivity extends AppCompatActivity {

    private TextView secondResult;
    private EditText secondValueToConvert;
    private Spinner secondSpinnerSelect1;
    private Spinner secondSpinnerSelect2;
    public Button secondDubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_settings);

    }

    public void metricScreen(View view) {
        Intent startMainActivity = new Intent(this, MainActivity.class);
        startActivity(startMainActivity);
    }

    public void imperialScreen(View view) {
        System.out.println("It was pressed");
        Intent startNewActivity = new Intent(this, Imperial.class);
        startActivity(startNewActivity);
    }
}
