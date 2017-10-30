package com.company;

public class Room {
    public Details details;
    public Style style;
    public Power power;

    //contents
    private Door door;
    private int doorCount;

    private Window window;
    private int windowCount;

    private AirConditioner airConditioner;
    private int airConditionerCount;

    private Floor floor;
    private int floorCount;

    private Fridge fridge;
    private int fridgeCount;

    private Sofa sofa;
    private int sofaCount;

    private TV tv;
    private int tvCount;

    public Room() {
    }

    public Room(Door door, int doorCount, Window window, int windowCount, AirConditioner airConditioner,
                int airConditionerCount, Floor floor, int floorCount, Fridge fridge, int fridgeCount, Sofa sofa,
                int sofaCount, TV tv, int tvCount) {

        this.door = door;
        this.doorCount = doorCount;

        this.window = window;
        this.windowCount = windowCount;

        this.airConditioner = airConditioner;
        this.airConditionerCount = airConditionerCount;

        this.floor = floor;
        this.floorCount = floorCount;

        this.fridge = fridge;
        this.fridgeCount = fridgeCount;

        this.sofa = sofa;
        this.sofaCount = sofaCount;

        this.tv = tv;
        this.tvCount = tvCount;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}


