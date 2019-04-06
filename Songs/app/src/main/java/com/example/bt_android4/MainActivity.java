package com.example.bt_android4;

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
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,R.layout.listrow, data);
        listView.setAdapter(listViewAdapter);
    }
    private void khoiTao() {
        data.add(new CustomListview(R.drawable.rihana,"Love The Way You Lie", "Rihana" , "5:45"));
        data.add(new CustomListview(R.drawable.shawnmendes,"Treat You Better", "Shawn Mendes", "4:30"));
        data.add(new CustomListview(R.drawable.adele,"Some One Like You", "Adele", "4:01"));
        data.add(new CustomListview(R.drawable.justin,"Love YourSelft", "Justin Beiber" , "5:01"));
    }
}
