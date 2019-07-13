package com.example.alc40phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_about_alc);
        WebView webview = findViewById(R.id.webview);
        setTitle("About ALC");

        webview.loadUrl("https://andela.com/alc/");
    }
}
