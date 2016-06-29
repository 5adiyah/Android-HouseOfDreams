package com.example.guest.houseofdreams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CatInfoActivity extends AppCompatActivity {
    private static final String TAG = "--------";
    @Bind(R.id.showCat) TextView mShowCat;
    @Bind(R.id.catPicture) ImageView mCatPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_info);
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
//
        ButterKnife.bind(this);
        Log.i(TAG, id);
            if(id.equals("2130837582")) {
                mShowCat.setText("This is Benita.");
                mCatPicture.setImageResource(R.drawable.cat1);
            } else if(id.equals("2130837580")){
                mShowCat.setText("This is Biscuit");
                mCatPicture.setImageResource(R.drawable.biscuit);
            } else if(id.equals("2130837581")){ //change this
                mShowCat.setText("This is Buttons");
                mCatPicture.setImageResource(R.drawable.buttons);
            } else if(id.equals("2130837583")){
                mShowCat.setText("This is Cypress");
                mCatPicture.setImageResource(R.drawable.cypress);
            } else if(id.equals("2130837584")){
                mShowCat.setText("This is Hadley");
                mCatPicture.setImageResource(R.drawable.hadley);
            } else if(id.equals("2130837585")){
                mShowCat.setText("This is Ian");
                mCatPicture.setImageResource(R.drawable.ian);
            } else if(id.equals("2130837591")) { //does this keep changing?
                mShowCat.setText("This is Raven");
                mCatPicture.setImageResource(R.drawable.raven);
            } else if(id.equals("2130837586")){
                mShowCat.setText("This is Inez");
                mCatPicture.setImageResource(R.drawable.inez);
            } else if(id.equals("2130837587")){
                mShowCat.setText("This is Linus");
                mCatPicture.setImageResource(R.drawable.linus);
            } else if(id.equals("2130837588")){
                mShowCat.setText("This is Max");
                mCatPicture.setImageResource(R.drawable.max);
            } else if(id.equals("2130837589")){
                mShowCat.setText("This is Mittens");
                mCatPicture.setImageResource(R.drawable.mittens);
            } else if(id.equals("2130837590")){
                mShowCat.setText("This is Rainbow");
                mCatPicture.setImageResource(R.drawable.rainbow);
            } else if(id.equals("2130837592")){
                mShowCat.setText("This is Ruby");
                mCatPicture.setImageResource(R.drawable.ruby);
            } else if(id.equals("2130837593")){
                mShowCat.setText("This is Stella");
                mCatPicture.setImageResource(R.drawable.stella);
            } else if(id.equals("2130837594")){
                mShowCat.setText("This is Taffy");
                mCatPicture.setImageResource(R.drawable.taffy);
            } else {
                mShowCat.setText("you have failed this and everything else in life");
            }


    }
}
