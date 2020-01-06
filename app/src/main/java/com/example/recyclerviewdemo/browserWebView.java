package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import java.util.ArrayList;

public class browserWebView extends MainActivity {

    String url;
    WebView myWebView;


    private void launchPage(View view){
        Bundle extras = getIntent().getExtras();
        url = extras.getString("url");
        Toast.makeText(this, url, Toast.LENGTH_SHORT).show();
        myWebView.loadUrl(url);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myWebView = new WebView(this);
        setContentView(myWebView);
        launchPage(myWebView);



    }
}
