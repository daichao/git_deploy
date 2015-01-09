package com.example.AdapterViewFilpper;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MyActivity extends Activity {
    private AdapterViewFlipper avf=null;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        avf=(AdapterViewFlipper)super.findViewById(R.id.avf);
        avf.setAdapter(new myBaseAdapter(this));
    }
    public void prev(View source){
        avf.showPrevious();
        avf.stopFlipping();
    }
    public void next(View source){
        avf.showNext();
        avf.stopFlipping();
    }
    public void auto(View source){
        avf.startFlipping();
    }
}
class myBaseAdapter extends BaseAdapter {
    private int[] imageIds = new int[]{
            R.drawable.a, R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e, R.drawable.f
    };

    @Override
    public int getCount() {
        return imageIds.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(imageIds[position]);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    myBaseAdapter(Context context) {
        super();
        this.context = context;
    }

    private Context context;
}