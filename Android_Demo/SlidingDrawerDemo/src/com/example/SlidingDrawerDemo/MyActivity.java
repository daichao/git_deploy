package com.example.SlidingDrawerDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;
import android.widget.Toast;

public class MyActivity extends Activity {
    private SlidingDrawer slidingDrawer = null;
    private ImageView handle = null;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        LinearLayout layout = (LinearLayout) super.findViewById(R.id.content);
        ImageView cang = new ImageView(this);
        cang.setImageResource(R.drawable.can);
        layout.addView(cang);

        this.slidingDrawer = (SlidingDrawer) super.findViewById(R.id.slidingDrawer);
        this.handle = (ImageView) super.findViewById(R.id.handle);

        this.slidingDrawer.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {
            @Override
            public void onDrawerOpened() {
                handle.setImageResource(R.drawable.right);
            }
        });
        this.slidingDrawer.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
            @Override
            public void onDrawerClosed() {
                handle.setImageResource(R.drawable.left);
            }
        });
        this.slidingDrawer.setOnDrawerScrollListener(new SlidingDrawer.OnDrawerScrollListener() {
            @Override
            public void onScrollStarted() {
                Toast.makeText(MyActivity.this, "开始拖动", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onScrollEnded() {
                Toast.makeText(MyActivity.this, "结束拖动", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
