package com.example.NumberPicker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MyActivity extends Activity {
    private NumberPicker numberPicker;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        numberPicker=(NumberPicker)super.findViewById(R.id.numberPicker);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(99);
        numberPicker.setValue(49);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                Toast.makeText(MyActivity.this,"原值:"+oldVal+"新值:"+newVal,Toast.LENGTH_LONG).show();
            }
        });
    }
}
