package com.example.ListViewProject_1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyActivity extends Activity {
    private SimpleAdapter sp;
    private ListView listView;
    private List<Map<String, Object>> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        list = new ArrayList<Map<String, Object>>();
        listView = new ListView(this);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("item1_imageivew", R.drawable.ic_launcher);
        map.put("item1_bigtv", "BIGTV");
        map.put("item1_smalltv", "SMALLTV");
        list.add(map);
        sp = new SimpleAdapter(this, list, R.layout.main, new String[]{"item1_imageivew", "item1_bigtv", "item1_smalltv"}, new int[]{R.id.iv, R.id.bigtv, R.id.smalltv});
        listView.setAdapter(sp);
        this.setContentView(listView);
    }
}
