package com.example.profilecreator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int COLOR_CODE = 0;
    public static final String COLOR_KEY = "white";

    static String PROFILE_KEY = "PROFILE";
    String name;
    String email;
    String dep;
    String color = "green";
    RadioGroup selected;
    ImageView colorPreview;
    EditText editName;
    EditText editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main Activity");

        selected = findViewById(R.id.radioGroup);
        colorPreview = findViewById(R.id.viewColor);
        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);

        findViewById(R.id.viewEdit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileColor.class);
                startActivityForResult(intent, COLOR_CODE);
            }

        });

        findViewById(R.id.submitButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNameFilled(editName)) {
                    name = editName.getText().toString();
                } else {
                    Toast.makeText(getApplicationContext(), "Error, please enter name",
                            Toast.LENGTH_LONG).show();
                }
                if (isEmailValid(editEmail)) {
                    email = editEmail.getText().toString();
                } else {
                    Toast.makeText(getApplicationContext(), "Error, please enter email",
                            Toast.LENGTH_LONG).show();
                }
                if (isNameFilled(editName) && isEmailValid(editEmail)) {
                    if (selected.getCheckedRadioButtonId() == R.id.sisButton) {
                        dep = "SIS";
                    } else if (selected.getCheckedRadioButtonId() == R.id.cisButton) {
                        dep = "CIS";
                    } else if (selected.getCheckedRadioButtonId() == R.id.bioButton) {
                        dep = "BIO";
                    }
                    Profile person = new Profile(name, email, dep, color);

                    Intent intent2 = new Intent(MainActivity.this, DisplayActivity.class);
                    intent2.putExtra(PROFILE_KEY, person);
                    startActivity(intent2);
                }
            }

            private boolean isNameFilled(EditText editName) {
                return editName.getText().toString().length() > 0;
            }
            private boolean isEmailValid(EditText editEmail) {
                return editEmail.getText().toString().length() > 0 && editEmail.getText().toString().contains("@") &&
                        editEmail.getText().toString().contains(".");
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
                if (requestCode == COLOR_CODE && resultCode == RESULT_OK && data != null) {
                    color = data.getStringExtra(COLOR_KEY);
                    updateColor(color);
                }

    }

    void updateColor(String color){

        switch (color) {
            case "green":
                colorPreview.setColorFilter(getResources().getColor(R.color.green));
                colorPreview.setContentDescription("green");
                break;
            case "yellow":
                colorPreview.setColorFilter(getResources().getColor(R.color.yellow));
                colorPreview.setContentDescription("yellow");
                break;
            case "red":
                colorPreview.setColorFilter(getResources().getColor(R.color.red));
                colorPreview.setContentDescription("red");
                break;
            case "blue":
                colorPreview.setColorFilter(getResources().getColor(R.color.blue));
                colorPreview.setContentDescription("blue");
                break;
            case "orange":
                colorPreview.setColorFilter(getResources().getColor(R.color.orange));
                colorPreview.setContentDescription("orange");
                break;
            case "grey":
                colorPreview.setColorFilter(getResources().getColor(R.color.grey));
                colorPreview.setContentDescription("grey");
                break;
        }
    }
}
