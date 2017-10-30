package com.company;

public class AirConditioner {
    public Details details;
    public Power power;
    public Style style;

    private int btu = 30_000;
    private String setting = "cooling";

    public AirConditioner() {
    }

    public AirConditioner(int btu) {
        this.btu = btu;
    }

    public void changeSetting(){
        if(this.setting == "cooling"){
            this.setting = "heating";
        } else {
            this.setting = "cooling";
        }
        System.out.println("AC is now set to " + this.setting +".");


    }

}
