package com.example.alc40phase1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class my_profile extends AppCompatActivity {
    ImageView  image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("My Profile");

        loadImage();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


       // FloatingActionButton fab = findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
           // }
       // });
    }
    public void loadImage(){

        image =  findViewById(R.id.image_profile);
        image.setImageResource(R.drawable.twiiter);
    }
}
