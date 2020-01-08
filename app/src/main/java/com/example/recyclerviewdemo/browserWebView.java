package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.util.ArrayList;

public class browserWebView extends AppCompatActivity {

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

        final String javascriptURL = "javascript: (function() {document.getElementById('userid').value= '50000005754949';}) ();";
        final String javascriptURL2 = "javascript: (function() {document.getElementById('password').value= '4949';}) ();";


        //final String javascriptURL = "javascript:document.getElementById(\"userid\").value='5';";




        myWebView = new WebView(this);
        //myWebView.getSettings().setJavaScriptEnabled(true);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        myWebView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        webSettings.setSupportZoom(true);
        webSettings.setDefaultTextEncodingName("utf-8");

        setContentView(myWebView);

        launchPage(myWebView);

        myWebView.setWebViewClient(new WebViewClient(){




            @Override

            public void onPageFinished(WebView view, String url) {

                Toast.makeText(browserWebView.this, javascriptURL, Toast.LENGTH_LONG).show();
                //myWebView.getSettings().setJavaScriptEnabled(true);
                view.loadUrl(javascriptURL);
                view.loadUrl(javascriptURL2);




            }
        });






    }
}
