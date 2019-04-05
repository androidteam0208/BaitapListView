package com.example.vantrantrucphuong.quanlihuyenthoaibongda;

/**
 * Created by Van Tran Truc Phuong on 3/30/2019.
 */

public class CustomListView {
    private String name;
    private String born;
    private int image;
    private int nation;

    public CustomListView(String name, String born, int image, int nation) {
        this.nation = nation;
        this.image = image;
        this.born = born;
        this.name = name;
    }

    public CustomListView(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNation() {
        return nation;
    }

    public void setNation(int nation) {
        this.nation = nation;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }
}
