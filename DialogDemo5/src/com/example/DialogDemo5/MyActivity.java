package com.example.DialogDemo5;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.gsm.SmsMessage;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;

public class MyActivity extends Activity {
    private PopupWindow popup=null;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
      View popView=  this.getLayoutInflater().inflate(R.layout.pop,null);
        popup=new PopupWindow(popView,500,800);
    }
    public void pop(View source){
        //popup.showAsDropDown(source);
       popup.showAtLocation(super.findViewById(R.id.popBtn), Gravity.CENTER,0,50);
    }
    public void close(View source){
        popup.dismiss();
    }
}
