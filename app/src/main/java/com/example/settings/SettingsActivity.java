package com.example.settings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //Fragment Transaction for settings Container
        getSupportFragmentManager().beginTransaction().replace(R.id.settings_container,new Settings()).commit();

    }
}
