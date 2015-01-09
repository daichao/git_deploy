package com.example.CalendarView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class MyActivity extends Activity {
    private CalendarView calendarView;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        calendarView=(CalendarView)super.findViewById(R.id.calendar);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(MyActivity.this,year+"-"+month+"-"+dayOfMonth,Toast.LENGTH_LONG).show();
            }
        });
    }
}
