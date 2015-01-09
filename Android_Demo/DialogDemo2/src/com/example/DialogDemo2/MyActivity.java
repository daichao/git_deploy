package com.example.DialogDemo2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends Activity {
    private  String[] hobbies=new String[]{
            "看动漫","瞎折腾","看妹子"
    };
    private TextView textView=null;
    private TextView textView2=null;
    private  TextView textView3=null;
    private int checkNum=1;
    private  boolean[] checkItems=new boolean[]{
            false,true,false
    };
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textView=(TextView)super.findViewById(R.id.txt);
        textView2=(TextView)super.findViewById(R.id.txt2);
        textView3=(TextView)super.findViewById(R.id.txt3);
    }
    public void dialog(View source){
        Dialog dialog=new AlertDialog.Builder(this)
                .setTitle("请选择您的爱好")
                .setIcon(R.drawable.ic_launcher)
                .setPositiveButton("确定",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(MyActivity.this,)
                    }
                })
                .setNegativeButton("取消",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setItems(hobbies,new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textView.setText(hobbies[which]);
                    }
                })
                .create();
        dialog.show();
    }
    public void dialog2(View source){
        Dialog dialog=new AlertDialog.Builder(this)
                .setTitle("请选择您的爱好")
                .setIcon(R.drawable.ic_launcher)
                .setPositiveButton("确定",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textView2.setText(hobbies[checkNum]);
                    }
                })
                .setNegativeButton("取消",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setSingleChoiceItems(hobbies,1,new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        checkNum=which;
//                        textView.setText();
                    }
                })
                .create();
        dialog.show();
    }
    public void dialog3(View source){
        Dialog dialog=new AlertDialog.Builder(this)
                .setTitle("请选择您的爱好")
                .setIcon(R.drawable.ic_launcher)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textView3.setText("");
                        for(int i=0;i<hobbies.length;i++){
                            if(checkItems[i]){
                                textView3.append(hobbies[i]+"、");
                            }
                        }
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setMultiChoiceItems(hobbies, checkItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        checkItems[which]=isChecked;
                    }
                })
                .create();
        dialog.show();
    }
}
