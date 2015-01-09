package com.example.AutoCompleteTextViewDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MyActivity extends Activity {

    private AutoCompleteTextView auto;
    private String data[]=new String[]{
            "java","java1234","csdn","Java知识分享"
    };
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        auto=(AutoCompleteTextView)super.findViewById(R.id.auto);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,data);
        this.auto.setAdapter(arrayAdapter);
    }
}
