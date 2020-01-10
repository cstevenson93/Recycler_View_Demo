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

public class eContent extends MainActivity {

    private static final String TAG = "eContent";

    //vars
    private ArrayList<String> mPackage = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mLinkUrls = new ArrayList<>();

    WebView webView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("E-Content");
        setContentView(R.layout.activity_econtent);
        Log.d(TAG,"onCreate: started.");

        initImageBitmaps();


    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing Bitmaps.");



        //mImageUrls.add("https://www.camdencountylibrary.org/sites/default/files/images/staffdayphoto500.jpg");
        //mNames.add("Staff Day");
        //mLinkUrls.add("https://www.camdencountylibrary.org/using-the-library");


        mImageUrls.add("https://lh3.googleusercontent.com/48wwD4kfFSStoxwuwCIu6RdM2IeZmZKfb1ZeQkga0qEf1JKsiD-hK3Qf8qvxHL09lQ=s180");
        mNames.add("Kindle Reader");
        mLinkUrls.add("market://details?id=com.amazon.kindle");
        mPackage.add("com.amazon.kindle");

        mImageUrls.add("https://lh3.googleusercontent.com/XD4PNp-EdVGvrFmvwr9Rt5GoUhcsTszVQPwOUYIbg3WAnh3cPFfEgC6tftiN820rxg4N=s180");
        mNames.add("Kanopy");
        mLinkUrls.add("market://details?id=com.kanopy");
        mPackage.add("com.kanopy");

        mImageUrls.add("https://lh3.googleusercontent.com/6LpW-j_2deNEViHpCtn2HNvGrXL7V4KmqNPuh488iw7Zcf6arhNN8Qu3GXiKphX2dms=s180");
        mNames.add("Hoopla");
        mLinkUrls.add("market://details?id=com.hoopladigital.android");
        mPackage.add("com.hoopladigital.android");

        mImageUrls.add("https://lh3.googleusercontent.com/dr_qIHpWj4Xv0wON0eKPDZQ1HlrANqXpzrHVVKguSSkQ74jbgNVQIlH5lrZZgJP9iOA=s180");
        mNames.add("OverDrive");
        mLinkUrls.add("market://details?id=com.overdrive.mobile.android.mediaconsole");
        mPackage.add("com.overdrive.mobile.android.mediaconsole");

        mImageUrls.add("https://lh3.googleusercontent.com/fsfzoSofx2cyzz-gFSUvSkh1TE9dDJ8lxRfBqykIuSzlfSvbX5SlFg1rXhOKvjkhGjg=s180");
        mNames.add("Libby, by OverDrive");
        mLinkUrls.add("market://details?id=com.overdrive.mobile.android.libby");
        mPackage.add("com.overdrive.mobile.android.libby");


        mImageUrls.add("https://lh3.googleusercontent.com/zXfWbG2f1xbsbRbD5XAkhyTzrbhaH-d_RKmg8TIHGxYDau1YA9tzX68MprnxzeBNLQ=s180");
        mNames.add("RB Digital");
        mLinkUrls.add("market://details?id=com.ocd");
        mPackage.add("com.ocd");

        mImageUrls.add("https://lh3.googleusercontent.com/vpf1uCk2PgjKPihGOVYGnvTYB3JHadRjl2cGj9kUdAntW_sG8MryuaSaJsnPjhErU_av=s180");
        mNames.add("SmartAlec Mobile Printing");
        mLinkUrls.add("market://details?id=comprise.online.smartalec");
        mPackage.add("comprise.online.smartalec");

        mImageUrls.add("https://lh3.googleusercontent.com/gvbeJ4qfEV2dOQoXK_eAPHiPGQ1_raqwloQqgsg-I9kJ8AaYuPW7UcKpq8mbfVIW3hv2=s180");
        mNames.add("Rosetta Stone");
        mLinkUrls.add("market://details?id=air.com.rosettastone.mobile.CoursePlayer");
        mPackage.add("air.com.rosettastone.mobile.CoursePlayer");

        mImageUrls.add("https://lh3.googleusercontent.com/NdZ3bKQKwYj6iY8GGbLrr8yHEVa_4G40Aaqz7cVyLLh_syhym-St8LRbuSytifb17PXrDaQ9WmVuscx5ak6-tomVQi5SCZsaJABO74qK5fCO12Og6CNVhwt2StUy1wW7kMnGYPBRGzPzommc-bEPw2vgW7Yp2n5zt7DV3Un6gvbzFkWPrzstHR4zxTMac7zO2PENy04Con1Ug0zWG-nVetTeRGeBVzLG2QCef9YTS5WoQMJV69YKkXTfc2XmUZfBP7j90LAZ80zCOK1acGvtnZplz7IwJ9Mgd8UgNgiOvVHudDt699E5r7SB8VhSNLJQxyHsG7oreL3AkY9VZ8zMnTCQ9j_7-iTyIvqwiddbIPFDoIie_uUL9sg8EAJ6xrN5tKo2qIo-56z5iGylM3pMmwbkBlXsZzJ29qFnE1sj9MHuplEKThSx9E3vfPMLH-g4EEHV61t16fyaPwIejIMPqXDeB2DEc7WGrVntw8jrGw5-z10vOmWAlaDZGMLJpG84tJLSbzqGTELZGhb0Gpcu0B8flyHsILEgmany_Z0gLVphlVv3Qvrmd4jSPgJTKsR2KfyY90KcJF6tu7w2nxcQ7q62d_xtkR438MXBkGT9l0XUfsXZDdFUIIos0buxOH19QXwBQuIPF-CMn3vUS3Vh13dhA9mFHeKrNWVRsJTRs6rZ57mmdKJV=s170-no");
        mNames.add("CamCat");
        mLinkUrls.add("https://camden.bywatersolutions.com/");
        mPackage.add("No Package");

        //webView = (WebView) findViewById(R.id.webview);

        initRecyclerView();

    }

    public void openBrowser(View view){
        startActivity(new Intent(getApplicationContext(), browserWebView.class));

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initrecyclerview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mPackage, mNames, mImageUrls,mLinkUrls, webView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
