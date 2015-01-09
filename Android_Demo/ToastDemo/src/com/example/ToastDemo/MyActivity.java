package com.example.ToastDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MyActivity extends Activity {
    private Button btn1,btn2,btn3;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn1=(Button)super.findViewById(R.id.btn1);
        btn2=(Button)super.findViewById(R.id.btn2);
        btn3=(Button)super.findViewById(R.id.btn3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyActivity.this,"Toast长时间",Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyActivity.this,"Toast短时间",Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast myToast=Toast.makeText(MyActivity.this,"Toast自定义",Toast.LENGTH_SHORT);
                LinearLayout toastView=(LinearLayout)myToast.getView();
                ImageView img=new ImageView(MyActivity.this);
                img.setImageResource(R.drawable.ic_launcher);
                toastView.addView(img,0);
                myToast.show();
            }
        });
    }
}
