package com.example.guest.houseofdreams;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

import static android.support.v4.app.ActivityCompat.startActivity;


public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;


        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(400, 400));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);


        return imageView;
    }

    // references to our images
    public static Integer[] mThumbIds = {
            R.drawable.cat1,
            R.drawable.biscuit,
            R.drawable.buttons,
            R.drawable.cypress,
            R.drawable.hadley,
            R.drawable.ian,
            R.drawable.inez,
            R.drawable.linus,
            R.drawable.max,
            R.drawable.mittens,
            R.drawable.rainbow,
            R.drawable.raven,
            R.drawable.ruby,
            R.drawable.taffy,
            R.drawable.stella
    };
}


