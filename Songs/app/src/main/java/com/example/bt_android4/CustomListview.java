package com.example.bt_android4;

public class CustomListview {
    private int imageId;
    private String name;
    private String artist;
    private String duration;

    public CustomListview(int imageId, String name, String artist, String duration) {
        this.imageId = imageId;
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
