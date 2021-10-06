package com.example.profilemanager_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}

public void SetTeamIcon(View view){
    Intent returnIntent = new Intent();

    ImageView SelectedImage = (ImageView) view;

    returnIntent.putExtra(name: "imageID", selectedImage.getId());
    setResult(RESULT_OK, returnIntent);

    finish();
}