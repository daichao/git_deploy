package com.example.StackView;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.StackView;

public class MyActivity extends Activity {
    private StackView stackView;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        stackView = (StackView) super.findViewById(R.id.sv);
        stackView.setAdapter(new MyBaseAdapter(this));
    }

    public void prev(View source) {
        stackView.showPrevious();
    }

    public void next(View source) {
        stackView.showNext();
    }
}

class MyBaseAdapter extends BaseAdapter {

    private int[] imageIds = new int[]{
            R.drawable.a, R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e, R.drawable.f
    };

    private Context context = null;

    public MyBaseAdapter(Context context) {
        super();
        this.context = context;
    }


    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return imageIds.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(imageIds[position]);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

}