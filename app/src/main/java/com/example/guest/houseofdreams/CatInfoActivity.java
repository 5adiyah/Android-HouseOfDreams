package com.example.guest.houseofdreams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CatInfoActivity extends AppCompatActivity {
    private static final String TAG = "--------";
    @Bind(R.id.showCat) TextView mShowCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_info);
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
//        Integer intId = Integer.parseInt(id);
//        Log.v(TAG, id);
        ButterKnife.bind(this);
        Log.i(TAG, id);
            if(id.equals("2130837582")) {
                mShowCat.setText("this is cat1");
            } else if(id.equals("2130837580")){
                mShowCat.setText("biscuit");
            } else if(id.equals("2130837581")){ //change this
                mShowCat.setText("buttons");
            } else if(id.equals("2130837583")){
                mShowCat.setText("cypress");
            } else if(id.equals("2130837584")){
                mShowCat.setText("hadley");
            } else if(id.equals("2130837585")){
                mShowCat.setText("ian");
            } else if(id.equals("2130837591")) { //does this keep changing?
                mShowCat.setText("raven");
            } else if(id.equals("2130837586")){
                mShowCat.setText("inez");
            } else if(id.equals("2130837587")){
                mShowCat.setText("linus");
            } else if(id.equals("2130837588")){
                mShowCat.setText("max");
            } else if(id.equals("2130837589")){
                mShowCat.setText("mittens");
            } else if(id.equals("2130837590")){
                mShowCat.setText("rainbow");
            } else if(id.equals("2130837592")){
                mShowCat.setText("ruby");
            } else if(id.equals("2130837593")){
                mShowCat.setText("stella");
            } else if(id.equals("2130837594")){
                mShowCat.setText("taffy");
            } else {
                mShowCat.setText("you have failed this and everything else in life");
            }


    }
}
