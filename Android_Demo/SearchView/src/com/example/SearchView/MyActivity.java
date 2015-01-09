package com.example.SearchView;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MyActivity extends Activity implements SearchView.OnQueryTextListener{
    private SearchView searchView;
    private ListView listView;
    private String[] data = new String[]{
            "java", "java1234", "javaeye", "csdn", "java知识分享网"
    };

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        searchView = (SearchView) super.findViewById(R.id.searchView);
        listView = (ListView) super.findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data));
        listView.setTextFilterEnabled(true);

        searchView.setSubmitButtonEnabled(true);
        searchView.setOnQueryTextListener(this);
    }
    @Override
    public boolean onQueryTextSubmit(String query) {
        Toast.makeText(this,"查询的信息是："+query,Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        if(TextUtils.isEmpty(newText)){
            listView.clearTextFilter();
        }else{
            listView.setFilterText(newText);
        }
        return false;
    }
}
