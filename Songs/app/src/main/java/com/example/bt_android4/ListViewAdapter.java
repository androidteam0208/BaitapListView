package com.example.bt_android4;

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
        TextView txtName;
        TextView txtArtist;
        TextView txtDuration;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        ViewHolder viewHolder = null;
        if(row == null){
            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            row = layoutInflater.inflate(layoutResourceId, parent, false);
//            setControl()
            viewHolder = new ViewHolder();
            viewHolder.imgIcon = (ImageView) row.findViewById(R.id.list_image);
            viewHolder.txtName = (TextView) row.findViewById(R.id.name);
            viewHolder.txtArtist = (TextView) row.findViewById(R.id.artist);
            viewHolder.txtDuration = (TextView) row.findViewById(R.id.duration);
        }
        else {
            viewHolder = (ViewHolder) row.getTag();
        }

        CustomListview customListView = data.get(position);
        viewHolder.imgIcon.setImageResource(customListView.getImageId());
        viewHolder.txtName.setText(customListView.getName());
        viewHolder.txtArtist.setText(customListView.getArtist());
        viewHolder.txtDuration.setText(customListView.getDuration());
        return row;
    }
}
