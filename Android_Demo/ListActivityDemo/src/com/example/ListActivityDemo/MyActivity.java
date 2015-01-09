package com.example.ListActivityDemo;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyActivity extends ListActivity {
    private SimpleAdapter simpleAdapter;
    private String data[][] = {
            {"01", "张三", "是个好学生1"},
            {"02", "张三2", "是个好学生2"},
            {"03", "张三3", "是个好学生3"},
            {"04", "张三4", "是个好学生4"},
    };
    private List<Map<String, String>> list = new ArrayList<Map<String, String>>();

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for(int i=0;i<data.length;i++){
            Map<String,String> map=new HashMap<String, String>();
            map.put("id",data[i][0]);
            map.put("name",data[i][1]);
            map.put("desc",data[i][2]);
            list.add(map);

        }
        this.simpleAdapter=new SimpleAdapter(MyActivity.this,
               list,
                R.layout.main,new String[]{"id","name","desc"},
                new int[]{R.id.id,R.id.name,R.id.desc});
        super.setListAdapter(simpleAdapter);
    }
}
