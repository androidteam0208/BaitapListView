package com.example.vantrantrucphuong.quanlidoanthucuong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.vantrantrucphuong.quanlidoanthucuong.Adapters.ListViewAdapter_Food;
import com.example.vantrantrucphuong.quanlidoanthucuong.Models.CustomListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    ArrayList<CustomListView> arrayListFood = new ArrayList<>();
    ListView listViewFood;
    Button btnBack;
    String food = "";
//    ImageView imageView;
//    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        setControl();
        setEvent();
    }

    private void setEvent() {
        khoiTao();
        ListViewAdapter_Food listViewAdapter_food = new ListViewAdapter_Food(this, R.layout.listview_food_row, arrayListFood);
        listViewFood.setAdapter(listViewAdapter_food);
        listViewFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(DrinkActivity.this, arrayListDrink.get(i).getName().toString(),Toast.LENGTH_LONG).show();
                food +=  arrayListFood.get(i).getName().toString() + " - ";
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent = new Intent();
                food = food.substring(0, food.length()-2);
                intent.putExtra("FOOD", food);
                setResult(2,intent);
                finish();//finishing activity
            }
        });
    }

    private void khoiTao() {
        arrayListFood.add(new CustomListView("Phở", R.drawable.pho));
        arrayListFood.add(new CustomListView("Bún Bò Huế", R.drawable.bunbo));
        arrayListFood.add(new CustomListView("Mì Quảng", R.drawable.miquang));
        arrayListFood.add(new CustomListView("Hủ Tiếu Nam Vang", R.drawable.hutieu));
    }

    private void setControl() {
        btnBack = (Button) findViewById(R.id.btnBack);
        listViewFood = (ListView) findViewById(R.id.listViewFood);
    }

}
