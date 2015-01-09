package com.example.MenuDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
//import android.support.v7.widget.PopupMenu;
import android.widget.Toast;

import java.lang.reflect.Method;

public class MyActivity extends Activity {

    private ListView lv=null;

    private String diaries[]={
            "苦逼的一天","快乐的一天",
            "无聊的一天","疯狂的一天"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        this.lv=(ListView) super.findViewById(R.id.lv);
        this.lv.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,this.diaries));
        super.registerForContextMenu(this.lv);// 上下文菜单 重写onCreateContextMenu onContextItemSelected  onContextMenuClosed
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        setIconEnable(menu,true);
        menu.add(Menu.NONE, 1, 0, "添加").setIcon(android.R.drawable.ic_menu_add);
        menu.add(Menu.NONE, 2, 1, "修改").setIcon(android.R.drawable.ic_menu_edit);
        menu.add(Menu.NONE, 3, 2, "删除").setIcon(android.R.drawable.ic_menu_delete);
        menu.add(Menu.NONE, 4, 3, "保存").setIcon(android.R.drawable.ic_menu_save);
        //子菜单
        SubMenu sendMenu=menu.addSubMenu(Menu.NONE, 5, 4, "发送").setIcon(android.R.drawable.ic_menu_send);
		/*sendMenu.add(Menu.NONE, 51, 0, "发送短信");
		sendMenu.add(Menu.NONE, 52, 1, "发送彩信");*/
        super.getMenuInflater().inflate(R.menu.send, sendMenu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Toast.makeText(this, "onPrepareOptionsMenu调用", Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, item.getTitle()+"onOptionsItemSelected调用", Toast.LENGTH_SHORT).show();
        switch(item.getItemId()){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
        }
        return true;
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        Toast.makeText(this, "onOptionsMenuClosed菜单关闭", Toast.LENGTH_SHORT).show();
    }

    private void setIconEnable(Menu menu, boolean enable) {
        try {
            Class<?> clazz = Class
                    .forName("com.android.internal.view.menu.MenuBuilder");
            Method m = clazz.getDeclaredMethod("setOptionalIconsVisible",
                    boolean.class);
            m.setAccessible(true);

            // MenuBuilder实现Menu接口，创建菜单时，传进来的menu其实就是MenuBuilder对象(java的多态特征)
            m.invoke(menu, enable);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("日记操作");
        menu.setHeaderIcon(R.drawable.diary);
		/*menu.add(Menu.NONE, 1, 0, "查看日记");
		menu.add(Menu.NONE, 2, 1, "编辑日记");
		menu.add(Menu.NONE, 3, 2, "删除日记");*/
        super.getMenuInflater().inflate(R.menu.diary, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this, item.getTitle()+"onContextItemSelected调用", Toast.LENGTH_SHORT).show();
        switch(item.getItemId()){
            case 1:
            case 2:
            case 3:
        }
        return false;
    }

    @Override
    public void onContextMenuClosed(Menu menu) {
        Toast.makeText(this, "onContextMenuClosed菜单关闭", Toast.LENGTH_SHORT).show();
    }

    //弹出菜单
    public void popupMenu(View source){
        PopupMenu popup=new PopupMenu(this, source);
        Menu menu=popup.getMenu();
        menu.add(Menu.NONE, 1, 0, "查看图片");
        menu.add(Menu.NONE, 2, 1, "删除图片");
//        super.getMenuInflater().inflate();
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch(item.getItemId()){
                    case 1:
                        Toast.makeText(MyActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                    case 2:
                        Toast.makeText(MyActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
        popup.show();
    }
}
