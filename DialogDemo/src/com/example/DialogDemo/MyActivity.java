package com.example.DialogDemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
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
    public  void dialog1(View source){
        Dialog dialog=new AlertDialog.Builder(this)
                .setTitle("系统提示")
                .setMessage("您确定要删除这条记录吗？")
                .setIcon(R.drawable.info)
                .create();
        dialog.show();
    }
    public  void dialog2(View source){
        Dialog dialog=new AlertDialog.Builder(this)
                .setTitle("系统提示")
                .setMessage("您确定要删除这条记录吗？")
                .setIcon(R.drawable.info)
                .setPositiveButton("确定",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MyActivity.this,"用户点击了确定按钮",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("取消",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MyActivity.this,"用户点击了取消按钮",Toast.LENGTH_SHORT).show();
                    }
                })
                .create();
        dialog.show();
    }
}
