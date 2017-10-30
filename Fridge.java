package com.company;

public class Fridge {
    public Details details;
    public Power power;

    private String contents;
    private boolean icemaker;
    private String freezerLocation;

    public Fridge(String contents, boolean icemaker, String freezerLocation) {
        this.contents = contents;
        this.icemaker = icemaker;
        this.freezerLocation = freezerLocation;
    }

    public Fridge(Details details, Power power, String contents, boolean icemaker, String freezerLocation) {
        this.details = details;
        this.power = power;
        this.contents = contents;
        this.icemaker = icemaker;
        this.freezerLocation = freezerLocation;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public boolean isIcemaker() {
        return icemaker;
    }

    public void setIcemaker(boolean icemaker) {
        this.icemaker = icemaker;
    }

    public String getFreezerLocation() {
        return freezerLocation;
    }

    public void setFreezerLocation(String freezerLocation) {
        this.freezerLocation = freezerLocation;
    }
}
