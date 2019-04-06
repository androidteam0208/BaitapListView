package com.example.vantrantrucphuong.quanlidoanthucuong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_chonthucan, btn_chondouong;
    TextView txtView_Result;
    String ketQua = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }



    private void setEvent() {
        btn_chonthucan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FoodActivity.class);  //Activity from den activity
                startActivityForResult(intent, 1);
            }
        });

        btn_chondouong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DrinkActivity.class);  //Activity from den activity
                startActivityForResult(intent, 2);
            }
        });

    }

    // Khi kết quả được trả về từ Activity khác, hàm onActivityResult sẽ được gọi.
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Kiểm tra requestCode có trùng với REQUEST_CODE vừa dùng
            // resultCode được set bởi DetailActivity
            // RESULT_OK chỉ ra rằng kết quả này đã thành công
            if(requestCode == 2)
            {
                String drink = data.getStringExtra("DRINK");
                ketQua += "- " + drink;
//                Toast.makeText(this, drink ,Toast.LENGTH_LONG).show();

            }

            if(requestCode == 1)
            {
                String food = data.getStringExtra("FOOD");
                ketQua += food;
//                txtView_Result.setText(food);
            }

            txtView_Result.setText(ketQua);
    }
    private void setControl() {
        btn_chonthucan = (Button) findViewById(R.id.btn_chonthucan);
        btn_chondouong = (Button) findViewById(R.id.btn_chondouong);
        txtView_Result = (TextView) findViewById(R.id.txtView_Result);
    }


}
