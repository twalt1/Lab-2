package com.example.profilemanager_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onOpenGoogleMaps(View view) {

        //Takes input from postalCode id and converts it to EditText, stores into teamAddress
        EditText teamAddress = (EditText) findViewById(R.id.postalCode);

        Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q=" + teamAddress.getText());

        //Create a URI from a string. Use result to create an intent
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

        //make intent explicit by setting Google Maps package
        mapIntent.setPackage("com.google.android.apps.maps");

        //Attempt to start the activity that can handle the intent
        startActivity(mapIntent);
    }
}