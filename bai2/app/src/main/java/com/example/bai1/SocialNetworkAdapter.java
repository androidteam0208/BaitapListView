package com.example.bai1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SocialNetworkAdapter extends ArrayAdapter<SocialNetwork> {
    Context context;
    int layoutResourceId;
    ArrayList<SocialNetwork> data = null;

    public SocialNetworkAdapter(Context context, int resource, ArrayList<SocialNetwork> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layoutResourceId = resource;
        this.data = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        SocialNetworkHolder holder = null;

        if (view == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            view = inflater.inflate(layoutResourceId,parent,false);

            holder = new SocialNetworkHolder();
            holder.imgIcon = (ImageView) view.findViewById(R.id.imageIcon);
            holder.txtTitle1 = (TextView) view.findViewById(R.id.textView1);
            holder.txtTitle2 = (TextView) view.findViewById(R.id.textView2);

            view.setTag(holder);
        }else {
            holder = (SocialNetworkHolder) view.getTag();
        }

        SocialNetwork item = data.get(position);
        holder.txtTitle1.setText(item.title1);
        holder.txtTitle2.setText(item.title2);
        holder.imgIcon.setImageResource(item.icon);

        return view;
    }

    static class SocialNetworkHolder{
        ImageView imgIcon;
        TextView txtTitle1;
        TextView txtTitle2;
    }
}