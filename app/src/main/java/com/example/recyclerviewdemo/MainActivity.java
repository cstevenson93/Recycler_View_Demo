package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mLinkUrls = new ArrayList<>();

    WebView webView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate: started.");

        initImageBitmaps();


    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing Bitmaps.");



        mImageUrls.add("https://www.camdencountylibrary.org/sites/default/files/images/staffdayphoto500.jpg");
        mNames.add("Staff Day");
        mLinkUrls.add("https://www.camdencountylibrary.org/using-the-library");

        mImageUrls.add("https://lh3.googleusercontent.com/48wwD4kfFSStoxwuwCIu6RdM2IeZmZKfb1ZeQkga0qEf1JKsiD-hK3Qf8qvxHL09lQ=s180");
        mNames.add("Kindle Reader");
        mLinkUrls.add("https://play.google.com/store/apps/details?id=com.amazon.kindle&hl=en_US");

        mImageUrls.add("https://lh3.googleusercontent.com/XD4PNp-EdVGvrFmvwr9Rt5GoUhcsTszVQPwOUYIbg3WAnh3cPFfEgC6tftiN820rxg4N=s180");
        mNames.add("Kanopy");
        mLinkUrls.add("https://play.google.com/store/apps/details?id=com.kanopy&hl=en_US");

        mImageUrls.add("https://lh3.googleusercontent.com/6LpW-j_2deNEViHpCtn2HNvGrXL7V4KmqNPuh488iw7Zcf6arhNN8Qu3GXiKphX2dms=s180");
        mNames.add("Hoopla");
        mLinkUrls.add("https://play.google.com/store/apps/details?id=com.hoopladigital.android&hl=en_US");

        mImageUrls.add("https://lh3.googleusercontent.com/dr_qIHpWj4Xv0wON0eKPDZQ1HlrANqXpzrHVVKguSSkQ74jbgNVQIlH5lrZZgJP9iOA=s180");
        mNames.add("OverDrive");
        mLinkUrls.add("https://play.google.com/store/apps/details?id=com.overdrive.mobile.android.mediaconsole&hl=en_US");

        mImageUrls.add("https://lh3.googleusercontent.com/fsfzoSofx2cyzz-gFSUvSkh1TE9dDJ8lxRfBqykIuSzlfSvbX5SlFg1rXhOKvjkhGjg=s180");
        mNames.add("Libby, by OverDrive");
        mLinkUrls.add("https://play.google.com/store/apps/details?id=com.overdrive.mobile.android.libby&hl=en_US");

        mImageUrls.add("https://lh3.googleusercontent.com/zXfWbG2f1xbsbRbD5XAkhyTzrbhaH-d_RKmg8TIHGxYDau1YA9tzX68MprnxzeBNLQ=s180");
        mNames.add("RB Digital");
        mLinkUrls.add("https://play.google.com/store/apps/details?id=com.ocd&hl=en_US");

        mImageUrls.add("https://lh3.googleusercontent.com/vpf1uCk2PgjKPihGOVYGnvTYB3JHadRjl2cGj9kUdAntW_sG8MryuaSaJsnPjhErU_av=s180");
        mNames.add("SmartAlec Mobile Printing");
        mLinkUrls.add("https://play.google.com/store/apps/details?id=comprise.online.smartalec&hl=en_US");

        mImageUrls.add("https://lh3.googleusercontent.com/gvbeJ4qfEV2dOQoXK_eAPHiPGQ1_raqwloQqgsg-I9kJ8AaYuPW7UcKpq8mbfVIW3hv2=s180");
        mNames.add("Rosetta Stone");
        mLinkUrls.add("https://play.google.com/store/apps/details?id=air.com.rosettastone.mobile.CoursePlayer&hl=en_US");

        mImageUrls.add("https://camden.bywatersolutions.com/images/5928997882a16710c814681352524751_camcat_smaller.png");
        mNames.add("CamCat");
        mLinkUrls.add("https://camden.bywatersolutions.com/");

        webView = (WebView) findViewById(R.id.webview);

        initRecyclerView();

    }

    public void openBrowser(View view){
        startActivity(new Intent(getApplicationContext(), browserWebView.class));

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initrecyclerview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls,mLinkUrls, webView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
