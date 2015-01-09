package com.example.ImageSwitcher;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.*;

import java.util.Iterator;

public class MyActivity extends Activity {
    private ImageSwitcher imageSwitcher;
    private TextSwitcher textSwitcher;
    private int[] imageIds=new int[]{
            R.drawable.a,R.drawable.b,
            R.drawable.c,R.drawable.d
    };
    private int[] textIds=new int[]{
            R.string.pic1,R.string.pic2,
            R.string.pic3,R.string.pic4
    };
    private  int index;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        imageSwitcher=(ImageSwitcher)super.findViewById(R.id.imgSwitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(MyActivity.this);
                return imageView;
            }
        });
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,android.R.anim.fade_out));
        imageSwitcher.setImageResource(imageIds[0]);


        index=0;

        textSwitcher=(TextSwitcher)super.findViewById(R.id.textSwitcher);
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView=new TextView(MyActivity.this);
                textView.setTextSize(25);
                return textView;
            }
        });
        textSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left));
        textSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right));
        textSwitcher.setText(this.getResources().getText(textIds[index]));
    }
    public void prev(View source){
        index=(index==0?imageIds.length-1:--index);
        imageSwitcher.setImageResource(imageIds[index]);
        textSwitcher.setText(this.getResources().getText(textIds[index]));
    }
    public  void next(View source){
        index=(index==imageIds.length-1?0:++index);
        imageSwitcher.setImageResource(imageIds[index]);
        textSwitcher.setText(this.getResources().getText(textIds[index]));
    }
}
