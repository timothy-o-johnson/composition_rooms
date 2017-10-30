package com.company;

public class Main {

    public static void main(String[] args) {
    // Room Contents
        AirConditioner airConditioner = new AirConditioner();
        Floor floor = new Floor(10,10,20);
        Fridge fridge = new Fridge("empty",true, "top");
        Sofa sofa = new Sofa("comfy");
        TV tv = new TV(true, true);
        Window window = new Window();
        Door door = new Door();

    // Actions
        airConditioner.changeSetting();

//Room Details
        Room kitchenDining = new Room(door, 3, window, 2, airConditioner,
                1, floor, 1, fridge, 1, sofa, 1, tv, 0);

        System.out.println(kitchenDining.getFridge().getContents());

    }
}
