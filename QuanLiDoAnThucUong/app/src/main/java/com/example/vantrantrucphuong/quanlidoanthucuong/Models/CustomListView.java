package com.example.vantrantrucphuong.quanlidoanthucuong.Models;

/**
 * Created by Van Tran Truc Phuong on 4/5/2019.
 */

public class CustomListView {
    private String name;
    private int image;

    public CustomListView(String name, int image) {
        this.image = image;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
