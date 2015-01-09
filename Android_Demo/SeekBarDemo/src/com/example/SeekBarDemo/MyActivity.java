package com.example.SeekBarDemo;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MyActivity extends Activity {
    private ImageView img;
    private SeekBar sb;
    private TextView log;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        img = (ImageView) super.findViewById(R.id.img);
        sb = (SeekBar) super.findViewById(R.id.sb);
        log = (TextView) super.findViewById(R.id.log);
        this.log.setMovementMethod(ScrollingMovementMethod.getInstance());
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                log.append("拖动条位置改变，数值：" + seekBar.getProgress() + "\n");
                img.setImageAlpha(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                log.append("开始拖动，数值：" + seekBar.getProgress() + "\n");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                log.append("结束拖动，数值："+seekBar.getProgress()+"\n");
            }
        });
    }
}
