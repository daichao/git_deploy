package com.example.tabHost;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MyActivity extends TabActivity {
    private TabHost tabHost=null;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tabHost=getTabHost();
        TabHost.TabSpec tab1=tabHost.newTabSpec("tab1").setIndicator("标签一").setContent(R.id.tab1);
        tabHost.addTab(tab1);
        TabHost.TabSpec tab2=tabHost.newTabSpec("tab2").setIndicator("标签二").setContent(R.id.tab2);
        tabHost.addTab(tab2);
        TabHost.TabSpec tab3=tabHost.newTabSpec("tab3").setIndicator("标签三").setContent(R.id.tab3);
        tabHost.addTab(tab3);
    }
}
