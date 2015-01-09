package com.example.TimePicker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TimePicker;

public class TimePickerActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TimePicker tp1 = (TimePicker) super.findViewById(R.id.tp1);
        tp1.setIs24HourView(true);
    }
}
