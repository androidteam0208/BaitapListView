package com.example.bai1;

public class SocialNetwork {
    public int icon;
    public String title;

    public SocialNetwork() {
    }

    public SocialNetwork(int icon, String title) {
        this.icon = icon;
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}