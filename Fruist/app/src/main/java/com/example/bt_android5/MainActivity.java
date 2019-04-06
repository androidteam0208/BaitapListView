package com.example.bt_android5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<CustomListview> data = new ArrayList<>();
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
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,R.layout.fruits, data);
        listView.setAdapter(listViewAdapter);
    }
    private void khoiTao() {
        data.add(new CustomListview(R.drawable.strawberry,"StrawBerry", "It is an aggregate accessory fruit"));
        data.add(new CustomListview(R.drawable.banana,"Banana", "It is the largest herbaceous flowering plant"));
        data.add(new CustomListview(R.drawable.orange,"StrawBerry", "Citrus Fruit"));
        data.add(new CustomListview(R.drawable.mixed,"StrawBerry", "Mixed Fruits"));
    }
}
