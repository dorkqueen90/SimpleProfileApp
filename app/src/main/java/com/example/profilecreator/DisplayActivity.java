package com.example.profilecreator;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
public class DisplayActivity extends AppCompatActivity  {

    TextView name;
    TextView email;
    TextView dep;
    String displayColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        name = findViewById(R.id.nameDisplayed);
        email = findViewById(R.id.emailDisplayed);
        dep = findViewById(R.id.depDisplayed);

        ConstraintLayout layout = (ConstraintLayout)findViewById(R.id.displayLayout);

        if(getIntent() != null && getIntent().getExtras() != null){
            Profile person = (Profile) getIntent().getExtras().getSerializable(MainActivity.PROFILE_KEY);

            displayColor = person.color;
            name.setText(person.name);
            email.setText(person.email);
            dep.setText(person.dep);
        }

        switch(displayColor){
            case "green":
                layout.setBackgroundColor(getResources().getColor(R.color.green));
                break;
            case "yellow":
                layout.setBackgroundColor(getResources().getColor(R.color.yellow));
                break;
            case "red":
                layout.setBackgroundColor(getResources().getColor(R.color.red));
                break;
            case "blue":
                layout.setBackgroundColor(getResources().getColor(R.color.blue));
                break;
            case "orange":
                layout.setBackgroundColor(getResources().getColor(R.color.orange));
                break;
            case "grey":
                layout.setBackgroundColor(getResources().getColor(R.color.grey));
                break;
        }

    }

}
