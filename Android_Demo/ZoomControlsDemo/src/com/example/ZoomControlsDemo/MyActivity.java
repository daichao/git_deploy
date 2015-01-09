package com.example.ZoomControlsDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ZoomControls;

public class MyActivity extends Activity {
    private TextView txt;
    private ZoomControls zc;
    private int size=8;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        txt=(TextView)super.findViewById(R.id.txt);
        zc=(ZoomControls)super.findViewById(R.id.zc);
        this.zc.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size+=1;
                txt.setTextSize(size);
            }
        });
        this.zc.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size-=1;
                txt.setTextSize(size);
            }
        });
    }
}
