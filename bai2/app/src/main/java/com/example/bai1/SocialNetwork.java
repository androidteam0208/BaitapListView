package com.example.bai1;

public class SocialNetwork {
    public int icon;
    public String title1;
    public String title2;

    public SocialNetwork() {
    }

    public SocialNetwork(int icon, String title1,String title2) {
        this.icon = icon;
        this.title1 = title1;
        this.title2 = title2;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }
}