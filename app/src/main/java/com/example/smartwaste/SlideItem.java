package com.example.smartwaste;

public class SlideItem {
    private int imageId;
    private String title;
    private String description;

    //parameterised constructor
    public SlideItem(int imageId, String title, String description) {
        this.imageId = imageId;
        this.title = title;
        this.description = description;
    }

    // getter methods
    public int getImageId(){ return imageId; }
    public String getTitle(){ return title; }
    public String getDescription(){ return description; }
}
