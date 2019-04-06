package com.example.vantrantrucphuong.quanlidoanthucuong.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vantrantrucphuong.quanlidoanthucuong.Models.CustomListView;
import com.example.vantrantrucphuong.quanlidoanthucuong.R;

import java.util.ArrayList;

/**
 * Created by Van Tran Truc Phuong on 4/5/2019.
 */

public class ListViewAdapter_Food extends ArrayAdapter<CustomListView> {
    Context context;
    int layoutResourceId;
    ArrayList<CustomListView> data = null;

    public ListViewAdapter_Food(Context context, int layoutResourceId, ArrayList<CustomListView>data){
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    static class ViewHolder {
        TextView nameFood;
        ImageView foodImage;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        ViewHolder viewHolder = null;
        if(row == null){
            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            row = layoutInflater.inflate(layoutResourceId, parent, false);
//            setControl()
            viewHolder = new ViewHolder();
            viewHolder.nameFood = (TextView) row.findViewById(R.id.txtView_Food);
            viewHolder.foodImage = (ImageView) row.findViewById(R.id.foodImage);
            row.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) row.getTag();
        }

        CustomListView customListView = data.get(position);
        viewHolder.nameFood.setText(customListView.getName());
        viewHolder.foodImage.setImageResource(customListView.getImage());
        return row;
    }
}