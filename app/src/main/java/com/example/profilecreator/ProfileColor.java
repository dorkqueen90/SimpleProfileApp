package com.example.profilecreator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

public class ProfileColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_color);

        findViewById(R.id.viewGreen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra(MainActivity.COLOR_KEY, "green");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });
        findViewById(R.id.viewYellow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra(MainActivity.COLOR_KEY, "yellow");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });
        findViewById(R.id.viewRed).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra(MainActivity.COLOR_KEY, "red");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });
        findViewById(R.id.viewBlue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra(MainActivity.COLOR_KEY, "blue");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });
        findViewById(R.id.viewOrange).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra(MainActivity.COLOR_KEY, "orange");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });
        findViewById(R.id.viewGrey).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra(MainActivity.COLOR_KEY, "grey");
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });
    }

}
