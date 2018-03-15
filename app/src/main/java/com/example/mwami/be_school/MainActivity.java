package com.example.mwami.be_school;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        setContentView(R.layout.activity_main);

        viewF=findViewById(R.id.viewF);
        viewF.setInAnimation(this,R.anim.fade_in);
        viewF.setOutAnimation(this,R.anim.fade_out);
        viewF.showNext();

    }
}
