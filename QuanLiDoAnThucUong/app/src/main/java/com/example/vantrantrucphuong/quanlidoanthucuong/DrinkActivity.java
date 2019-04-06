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

public class DrinkActivity extends AppCompatActivity {


    ArrayList<CustomListView> arrayListDrink = new ArrayList<>();
    ListView listViewDrink;
    Button btnBack;
    String drink = "";
//    ImageView imageView;
//    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        setControl();
        setEvent();
    }

    private void setEvent() {
        khoiTao();
        ListViewAdapter_Food listViewAdapter_drink = new ListViewAdapter_Food(this, R.layout.listview_food_row, arrayListDrink);
        listViewDrink.setAdapter(listViewAdapter_drink);
        listViewDrink.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(DrinkActivity.this, arrayListDrink.get(i).getName().toString(),Toast.LENGTH_LONG).show();
                drink +=  arrayListDrink.get(i).getName().toString() + " - ";
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent = new Intent();
                drink = drink.substring(0, drink.length()-2);
                intent.putExtra("DRINK",drink);
                setResult(2,intent);
                finish();//finishing activity
            }
        });
    }

    @Override
    public void onBackPressed() {

        // đặt resultCode là Activity.RESULT_CANCELED thể hiện
        // đã thất bại khi người dùng click vào nút Back.
        // Khi này sẽ không trả về data.
        setResult(MainActivity.RESULT_CANCELED);
        super.onBackPressed();
    }

    private void khoiTao() {
        arrayListDrink.add(new CustomListView("Pepsi", R.drawable.pepsi));
        arrayListDrink.add(new CustomListView("Coca", R.drawable.coca));
        arrayListDrink.add(new CustomListView("Heineken", R.drawable.ken));
        arrayListDrink.add(new CustomListView("Aquafina", R.drawable.aqua));
    }

    private void setControl() {
        btnBack = (Button) findViewById(R.id.btnBack);
        listViewDrink = (ListView) findViewById(R.id.listViewDrink);
    }

}