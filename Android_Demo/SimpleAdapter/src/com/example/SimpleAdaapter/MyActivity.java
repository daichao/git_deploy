package com.example.SimpleAdaapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyActivity extends Activity {
private String data[][]=new String[][]{
        {String.valueOf(R.drawable.a),"疯狂的小鸟","消息11"},
        {String.valueOf(R.drawable.b),"疯狂的小鸡","消息22"},
        {String.valueOf(R.drawable.c),"疯狂的小鸭","消息33"},
        {String.valueOf(R.drawable.d),"疯狂的小猫","消息44"},
        {String.valueOf(R.drawable.e),"疯狂的小狗","消息55"},
};
    private List<Map<String,String>>qqList=new ArrayList<Map<String, String>>();
    private ListView qqListView;
    private SimpleAdapter simpleAdapter;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        this.qqListView=(ListView)super.findViewById(R.id.qqf);
        for(int i=0;i<this.data.length;i++){
            Map<String,String> qq=new HashMap<String, String>();
            qq.put("pic",data[i][0]);
            qq.put("nickName",data[i][1]);
            qq.put("msg",data[i][2]);
            this.qqList.add(qq);
        }
        this.simpleAdapter=new SimpleAdapter(MyActivity.this,
                qqList,
                R.layout.item,
                new String[]{"pic","nickName","msg"},
                new int[]{R.id.pic,R.id.nickName,R.id.msg});
        this.qqListView.setAdapter(this.simpleAdapter);
        this.qqListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Map<String,String>map=(Map<String,String>)simpleAdapter.getItem(position);
                Toast.makeText(MyActivity.this,"被点击的好友是："+map.get("nickName"),Toast.LENGTH_SHORT).show();
            }
        });
        this.qqListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
               Map<String,String>map=(Map<String,String>)simpleAdapter.getItem(position);
                Toast.makeText(MyActivity.this,"被长按的好友是："+map.get("nickName"),Toast.LENGTH_LONG).show();
                return false;
            }
        });

        this.qqListView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}
