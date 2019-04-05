package com.example.vantrantrucphuong.quanlihuyenthoaibongda;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Van Tran Truc Phuong on 3/30/2019.
 */

//public class ListViewAdapter extends BaseAdapter {
//    ArrayList<CustomListView> arrayList;
//    //    truyền vào màn hình
//    Context context;
//
//    public ListViewAdapter(ArrayList<CustomListView> arrCategory, Context context) {
//        this.context = context;
//        this.arrayList = arrCategory;
//    }
//
//    @Override
//    public int getCount() {
//        return arrayList.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return arrayList.get(i);
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return i;
//    }
//
////    hỗ trợ việc load dữ liệu nhanh hơn
//
//    public class ViewHolder {
//        TextView legendName, legendBorn;
//        ImageView legendImage, nation;
//    }
//
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        ViewHolder viewHolder = null;
////        view chưa tồn tại
//        if (view == null) {
//            viewHolder = new ViewHolder();
//            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
//            view = layoutInflater.inflate(R.layout.listview_item_row, null);
////            setControl()
//            viewHolder.legendName = (TextView) view.findViewById(R.id.legendName);
//            viewHolder.legendBorn = (TextView) view.findViewById(R.id.legendBorn);
//            viewHolder.legendImage = (ImageView) view.findViewById(R.id.legendImage);
//            viewHolder.nation = (ImageView) view.findViewById(R.id.Nation);
//            view.setTag(viewHolder);
//        } else {
//            viewHolder = (ViewHolder) view.getTag();
//        }
//
//        CustomListView customListView = (CustomListView) getItem(i);
//        viewHolder.legendName.setText(customListView.getName());
//        viewHolder.legendBorn.setText(customListView.getBorn());
//        viewHolder.legendImage.setImageResource(customListView.getImage());
//        viewHolder.nation.setImageResource(customListView.getNation());
//        return view;
//    }
//}

    public class ListViewAdapter extends ArrayAdapter<CustomListView> {
        Context context;
        int layoutResourceId;
        ArrayList<CustomListView> data = null;

        public ListViewAdapter(Context context, int layoutResourceId, ArrayList<CustomListView>data){
            super(context, layoutResourceId, data);
            this.layoutResourceId = layoutResourceId;
            this.context = context;
            this.data = data;
        }

        static class ViewHolder {
            TextView legendName, legendBorn;
            ImageView legendImage, nation;
        }

        public View getView(int position, View convertView, ViewGroup parent){
            View row = convertView;
            ViewHolder viewHolder = null;
            if(row == null){
                LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
                row = layoutInflater.inflate(layoutResourceId, parent, false);
//            setControl()
                viewHolder = new ViewHolder();
                viewHolder.legendName = (TextView) row.findViewById(R.id.legendName);
                viewHolder.legendBorn = (TextView) row.findViewById(R.id.legendBorn);
                viewHolder.legendImage = (ImageView) row.findViewById(R.id.legendImage);
                viewHolder.nation = (ImageView) row.findViewById(R.id.Nation);
                row.setTag(viewHolder);
            }
            else {
                viewHolder = (ViewHolder) row.getTag();
            }

            CustomListView customListView = data.get(position);
            viewHolder.legendName.setText(customListView.getName());
            viewHolder.legendBorn.setText(customListView.getBorn());
            viewHolder.legendImage.setImageResource(customListView.getImage());
            viewHolder.nation.setImageResource(customListView.getNation());
            return row;
        }
    }