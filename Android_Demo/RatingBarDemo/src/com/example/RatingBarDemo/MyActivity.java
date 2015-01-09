package com.example.RatingBarDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MyActivity extends Activity {
    private RatingBar rb;
    private TextView result;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        rb= (RatingBar) super.findViewById(R.id.rb);
        result= (TextView) super.findViewById(R.id.result);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                result.setText("用户评分："+rating+"分");
            }
        });

    }
}
