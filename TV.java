package com.company;

public class TV {
    public Details details;
    public Power power;

    private boolean cableReady;
    private boolean smart;


    public TV() {
        this(true,false);
    }

    public TV(boolean cableReady, boolean smart) {
        this.cableReady = cableReady;
        this.smart = smart;
    }

    public boolean isCableReady() {
        return cableReady;
    }

    public void setCableReady(boolean cableReady) {
        this.cableReady = cableReady;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
