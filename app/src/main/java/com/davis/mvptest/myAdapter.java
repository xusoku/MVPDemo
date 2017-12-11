package com.davis.mvptest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xushengfu on 2017/12/10.
 */

public class myAdapter extends BaseAdapter {
    private List<Girl> list;
    private Context context;

    public myAdapter(Context con, List<Girl> list) {
        context=con;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView textView=new TextView(context);
        textView.setText(list.get(position).getName()+" "+list.get(position).getAge());

        return textView;
    }

}
