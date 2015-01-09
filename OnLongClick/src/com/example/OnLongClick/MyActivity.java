package com.example.OnLongClick;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MyActivity extends Activity {
    private ImageView img;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        img=(ImageView)super.findViewById(R.id.img);
        img.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MyActivity.this,"我被长按了~~",Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }
}
