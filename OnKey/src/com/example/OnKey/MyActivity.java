package com.example.OnKey;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MyActivity extends Activity {
    private EditText input;
    private ImageView result;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        input= (EditText) super.findViewById(R.id.input);
        result=(ImageView)super.findViewById(R.id.img);
        input.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                switch(event.getAction()){
                    case KeyEvent.ACTION_DOWN:
                    default:break;
                    case KeyEvent.ACTION_UP:
                        String info=input.getText().toString();
                        if(info.matches("\\w+@\\w+\\.\\w+")) {
                            result.setImageResource(R.drawable.right);
                        }
                        else{
                        result.setImageResource(R.drawable.wrong);
                    }
                }
                return false;
            }
        });
    }
}
