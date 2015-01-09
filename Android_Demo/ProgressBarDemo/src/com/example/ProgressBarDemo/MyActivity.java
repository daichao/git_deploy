package com.example.ProgressBarDemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;


public class MyActivity extends Activity {
    private Button btn;
    private ProgressBar pb1,pb2;
    private  int max=100;
    int currentProgress=0;
    Handler handler=new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if(msg.what==0){
                pb2.setVisibility(View.VISIBLE);
            }else if(msg.what==1){
                pb2.setVisibility(View.GONE);
                Toast.makeText(MyActivity.this,"数据已经加载完毕",Toast.LENGTH_LONG).show();
            }else if(msg.what==2){
                pb2.setProgress(currentProgress);
            }
        }
    };
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn=(Button)super.findViewById(R.id.btn1);
//        pb1=(ProgressBar)super.findViewById(R.id.pb1);
        pb2=(ProgressBar)super.findViewById(R.id.pb2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.sendEmptyMessage(0);
                new Thread(){
                    @Override
                    public void run() {
                        while(currentProgress<max) {
                            loadData();
                            handler.sendEmptyMessage(2);
                        }
                        handler.sendEmptyMessage(1);
                        currentProgress=0;
                    }
                }.start();
            }
        });


    }

    private int loadData(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return currentProgress++;
    }
}
