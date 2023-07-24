package com.mintic.university;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<String> names;

    public Adaptador(Context context1, int layout1, ArrayList<String> names1){
        this.context=context1;
        this.layout=layout1;
        this.names=names1;
    }


    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int position) {
        return this.names.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        LayoutInflater layoutInflater= LayoutInflater.from(this.context);
        v=layoutInflater.inflate(R.layout.item,null);

        String currentName= names.get(position);
        TextView textView=v.findViewById(R.id.txtVItem);
        textView.setText(currentName);
        return v;
    }
}
