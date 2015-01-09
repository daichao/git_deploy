package com.example.ProgressDialogDemo;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void search(View source){
        final ProgressDialog dialog=new ProgressDialog(this);
        dialog.setTitle("查询数据");
        dialog.setMessage("玩命加载中。。。");
        dialog.show();
        dialog.onStart();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    dialog.dismiss();
                }
            }
        }.start();
    }
}
