package com.company;

public class Sofa {
    public Details details;

    private String comfort;

    public Sofa(String comfort) {
        this.comfort = comfort;
    }

    public Sofa(Details details, String comfort) {
        this.details = details;
        this.comfort = comfort;
    }
}
