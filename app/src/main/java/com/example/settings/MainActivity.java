package com.example.settings;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button settings;
    TextView textView;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        settings = findViewById(R.id.settings);
        textView = findViewById(R.id.textView);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);

        Button button = findViewById(R.id.sTORAGEE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MANAGE_PACKAGE_STORAGE);
                startActivity(intent);
            }
        });


        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SettingsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        String change = sharedPreferences.getString("list","");
        textView.append("list"+change);
    }

    @Override
    protected void onPause() {
        super.onPause();
        String change = sharedPreferences.getString("list","");
        textView.append("list"+change);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
