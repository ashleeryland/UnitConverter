package com.example.ashlee.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ChangeSettingsActivity extends AppCompatActivity {

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
