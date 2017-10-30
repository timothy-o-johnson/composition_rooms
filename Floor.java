package com.company;

public class Floor {
    public Details details;
    private int height;
    private int length;
    private int width;

    public Floor(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Floor(Details details, int height, int length, int width) {
        this.details = details;
        this.height = height;
        this.length = length;
        this.width = width;
    }
}

