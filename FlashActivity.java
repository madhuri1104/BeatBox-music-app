package com.example.beatbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class FlashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView appname;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent nextScreen=new Intent(FlashActivity.this,MainActivity.class);
                startActivity(nextScreen);
                finish();
            }
        },3000);

        appname=findViewById(R.id.beatbox);
        appname.animate().scaleYBy(0.8f).scaleXBy(0.8f).alpha(1).setDuration(1000);
    }
}