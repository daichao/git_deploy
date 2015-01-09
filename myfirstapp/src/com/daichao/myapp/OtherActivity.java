package com.daichao.myapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by Administrator on 2014/12/3 0003.
 */
public class OtherActivity extends Activity implements OnClickListener {
    private Button btn;
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        Log.v("MainActivity","onCreate");
        btn=(Button)findViewById(R.id.Other_btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btn){
            this.finish();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("MainActivity","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivity","onDestroy");
    }
}
