package com.example.bt_android5;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<CustomListview> {
    Context context;
    int layoutResourceId;
    ArrayList<CustomListview> data = null;

    public ListViewAdapter(Context context, int layoutResourceId, ArrayList<CustomListview>data){
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    static class ViewHolder {
        ImageView imgIcon;
        TextView txtTitle;
        TextView txtText;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        ViewHolder viewHolder = null;
        if(row == null){
            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            row = layoutInflater.inflate(layoutResourceId, parent, false);
//            setControl()
            viewHolder = new ViewHolder();
            viewHolder.imgIcon = (ImageView) row.findViewById(R.id.imgIcon);
            viewHolder.txtTitle = (TextView) row.findViewById(R.id.txtTitle);
            viewHolder.txtText = (TextView) row.findViewById(R.id.txtText);
        }
        else {
            viewHolder = (ViewHolder) row.getTag();
        }

        CustomListview customListView = data.get(position);
        viewHolder.imgIcon.setImageResource(customListView.getImageId());
        viewHolder.txtTitle.setText(customListView.getTitle());
        viewHolder.txtText.setText(customListView.getText());
        return row;
    }
}