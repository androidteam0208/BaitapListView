package com.example.bt_android5;

public class CustomListview {

    private int imageId;
    private String title;
    private String text;

    public CustomListview(int imageId, String title, String text) {
        this.imageId = imageId;
        this.title = title;
        this.text = text;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }
}
