package com.example.vantrantrucphuong.quanlihuyenthoaibongda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<CustomListView> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();

    }

    private void setControl(){
        listView = (ListView) findViewById(R.id.listView);
    }

    private void setEvent() {
        khoiTao();
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,R.layout.listview_item_row, arrayList);
        listView.setAdapter(listViewAdapter);
    }

    private void khoiTao() {
        arrayList.add(new CustomListView("Pele","October 23, 1940 (age 72)",R.drawable.pele,R.drawable.brazil));
        arrayList.add(new CustomListView("Diego Maradona","October 30, 1960 (age 52)",R.drawable.maradona,R.drawable.argentina));
        arrayList.add(new CustomListView("ohan Cruyff","April 25, 1947 (age 65)",R.drawable.pele,R.drawable.argentina));
        arrayList.add(new CustomListView("Franz Beckenbauer","September 11, 1945 (age 67)",R.drawable.pele,R.drawable.argentina));
        arrayList.add(new CustomListView("Michel Platini","June 21, 1955 (age 57)",R.drawable.pele,R.drawable.argentina));
        arrayList.add(new CustomListView("Ronaldo De Lima","September 22, 1976 (age 36)",R.drawable.pele,R.drawable.argentina));
    }

}
