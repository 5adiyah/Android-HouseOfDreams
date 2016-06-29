package com.example.guest.houseofdreams;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;


import butterknife.Bind;
import butterknife.ButterKnife;

public class CatSearchActivity extends AppCompatActivity{
    @Bind(R.id.catGrid) GridView mCatGrid;
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_search);
        ButterKnife.bind(this);
        mCatGrid.setAdapter(new ImageAdapter(this));

        mCatGrid.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Intent intent = new Intent(CatSearchActivity.this, CatInfoActivity.class);
                intent.putExtra("id", ImageAdapter.mThumbIds[i].toString());
                Log.v(TAG, (ImageAdapter.mThumbIds[i]).toString());
                startActivity(intent);
            }
        });

    }


}
