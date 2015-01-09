package com.example.SwitchDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MyActivity extends Activity {
    private Switch aSwitch;
    private TextView result;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        aSwitch=(Switch)super.findViewById(R.id.aswitch);
        result=(TextView)super.findViewById(R.id.listener);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    result.setText("开");
                }
                else{
                    result.setText("关");
                }
            }
        });

    }
}
