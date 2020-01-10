package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClick(View v) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.kanopy");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {


            Toast.makeText(MainActivity.this, "There is no package available in android", Toast.LENGTH_LONG).show();
        }
    }

    public void click(View view){
        Intent eContentActivity = new Intent(this, eContent.class);
        this.startActivity(eContentActivity) ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Main");
        setContentView(R.layout.activity_main);
    }
}
