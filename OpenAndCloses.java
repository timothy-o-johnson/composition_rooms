package com.company;

public class OpenAndCloses {

    private String openState;

    public void open(){
        if(this.openState != "open"){
            this.openState = "open";
        }

        System.out.println("Window is open.");

    }

    public void close(){
        if(this.openState != "closed"){
            this.openState = "closed";
        }

        System.out.println("Object is closed.");

    }

}


