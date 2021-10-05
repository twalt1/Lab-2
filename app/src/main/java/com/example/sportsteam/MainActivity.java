package com.example.sportsteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //instance variables
    String teamName = "";
    String postalCode = "";

    EditText teamNameInput;
    EditText postalCodeInput;

    Button postalCodeSubmitButton;

    ImageButton profileDisplayButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get EditText inputs from screen id
        teamNameInput = (EditText) findViewById(R.id.teamNameId);
        postalCodeInput = (EditText) findViewById(R.id.postalCodeId);
        postalCodeSubmitButton = (Button) findViewById(R.id.googleMapSubmitId);
        profileDisplayButton = (ImageButton) findViewById(R.id.profileDisplayId);


        //Once the postal code submit button is clicked on, do the following:
        //1. Get all user input into our string variables
        //2. Open location in google maps
        postalCodeSubmitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Get strings from EditText inputs
                teamName = teamNameInput.getText().toString();
                postalCode = postalCodeInput.getText().toString();

                //Code from Lab Tutorial to open google map
                Uri ggmIntentUri = Uri.parse("http://maps.google.co.in/maps?q=" + postalCodeInput.getText());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, ggmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        //When the profile button is clicked on, open new activity
        profileDisplayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openProfileActivity();
            }
        });

        


    }

    //Opens the Profile Avatar Activity
    private void openProfileActivity() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}