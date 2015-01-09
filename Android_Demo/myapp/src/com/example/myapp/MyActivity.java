package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        TextView tv=new TextView(this);
        tv.setText("这是一个测试Android的HelloWorld");
        setContentView(tv);
    }
}
