package com.company;

public class Power {
    private String name;

    private boolean isPowered;
    private String powerSource;

    private String powerStatus = "off";

    public Power(String name) {
        this(name,true,"wired","off");
    }

    public Power(String name, boolean isPowered, String powerSource, String powerStatus) {

        this.name = name;
        this.isPowered = isPowered;
        this.powerSource = powerSource;
        this.powerStatus = powerStatus;
    }

    private void powerOn() {
        if (isPowered) {
            if (powerStatus == "off") {
                powerStatus = "on";
            }
            System.out.println(this.name + " is on.");
        }

    }

    private void powerOff() {
        if (isPowered) {
            if (powerStatus == "on") {
                powerStatus = "off";
            }
            System.out.println(this.name + " is off.");
        }

    }
}
