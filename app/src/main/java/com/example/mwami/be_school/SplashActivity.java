package com.example.mwami.be_school;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent =  new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.finish();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                SplashActivity.this.startActivity(mainIntent);
            }
        },2000);

    }
}
