package com.example.ChronometerDemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MyActivity extends Activity {
    private Button start,stop;
    private Chronometer ch;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        start=(Button)super.findViewById(R.id.start);
        stop=(Button)super.findViewById(R.id.stop);
        ch=(Chronometer)super.findViewById(R.id.ch);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch.setBase(SystemClock.elapsedRealtime());
                ch.start();
                start.setEnabled(false);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch.stop();
                start.setEnabled(true);

            }
        });
    }
}
