package com.example.ToggleButtonDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MyActivity extends Activity {
    private ToggleButton tb;
    private TextView tv;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tb=(ToggleButton)super.findViewById(R.id.toggle);
        tv=(TextView)super.findViewById(R.id.listener);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tv.setText("开");
                }else {
                    tv.setText("关");
                }
            }
        });
    }
}
