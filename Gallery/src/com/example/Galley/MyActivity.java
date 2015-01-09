package com.example.Galley;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MyActivity extends Activity {
private Gallery gallery;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        gallery=(Gallery)super.findViewById(R.id.gallery);
        gallery.setAdapter(new myBaseAdapter(this));
    }
}

class myBaseAdapter extends BaseAdapter{
    private  int[] imageIds=new int[]{
            R.drawable.a,R.drawable.b,R.drawable.c,
            R.drawable.d,R.drawable.e,R.drawable.f
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
        ImageView imageView=new ImageView(context);
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