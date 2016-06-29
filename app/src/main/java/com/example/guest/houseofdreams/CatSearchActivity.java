package com.example.guest.houseofdreams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import butterknife.Bind;
import butterknife.ButterKnife;

public class CatSearchActivity extends AppCompatActivity {
    @Bind(R.id.catGrid) GridView mCatGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_search);
        ButterKnife.bind(this);
        mCatGrid.setAdapter(new ImageAdapter(this));
    }
}
