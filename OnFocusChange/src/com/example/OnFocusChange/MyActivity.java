package com.example.OnFocusChange;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends Activity {
    private EditText usr,psd;
    private TextView userName,password;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        usr=(EditText)super.findViewById(R.id.usr);
        userName=(TextView)super.findViewById(R.id.usrName);
        psd=(EditText)super.findViewById(R.id.psd);
        password=(TextView)super.findViewById(R.id.password);
        usr.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(v.getId()==usr.getId()){
                    if(hasFocus){
                        Toast.makeText(MyActivity.this,"获取焦点",Toast.LENGTH_SHORT).show();
                    }else {
                        if(usr.getText().toString().trim().length()==0){
                            userName.setText("用户名不能为空");
                        }else{
                            userName.setText("");
                        }
                    }
                }

            }
        });
        psd.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(v.getId()==psd.getId()){
                    if(hasFocus){
                        Toast.makeText(MyActivity.this,"获取焦点",Toast.LENGTH_SHORT).show();
                    }else {
                        if(psd.getText().toString().trim().length()==0){
                            password.setText("密码不能为空");
                        }else{
                            password.setText("");
                        }
                    }
                }
            }
        });
    }
}
