package com.example.OnTouch;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyActivity extends Activity {
    private TextView imginfo;
    private ImageView img;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        imginfo=(TextView)super.findViewById(R.id.imginfo);
        img=(ImageView)super.findViewById(R.id.img);
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                imginfo.setText("x="+event.getX()+",y="+event.getY());
                return false;
            }
        });
    }
}
