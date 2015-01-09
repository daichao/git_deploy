package com.example.PickerDialogDemo;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MyActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void datePick(View source){
        Dialog dialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Toast.makeText(MyActivity.this,"选择的日期是："+year+"-"+(monthOfYear+1)+"-"+dayOfMonth,Toast.LENGTH_SHORT).show();
            }
        },2014,12,15);
        dialog.show();
    }
public void timePick(View source){
    Dialog dialog=new TimePickerDialog(this,new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            Toast.makeText(MyActivity.this,"选择的时间是："+hourOfDay+":"+minute,Toast.LENGTH_SHORT).show();
        }
    },14,25,true);
    dialog.show();
}

}
