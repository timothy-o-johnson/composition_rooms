package com.company;

public class Details {
    private String name;
    private String brand;
    private int purchaseYear;
    private double purchasePrice;
    private String condition;
    private String description;

    private Dimensions dimensions;
    private int weight; //in pounds
    private String material;
    private String color;
    private int count;
    private String location;

    public Details() {
        this("na","na", 0,0, "na", "none",
                new Dimensions(0,0,0),0,"na","na", 1,
                "not yet placed");
    }

    public Details(String name, String brand, int purchaseYear, double purchasePrice, String condition,
                   String description, Dimensions dimensions, int weight, String material, String color,
                   int count, String location) {
        this.name = name;
        this.brand = brand;
        this.purchaseYear = purchaseYear;
        this.purchasePrice = purchasePrice;
        this.condition = condition;
        this.description = description;
        this.dimensions = dimensions;
        this.weight = weight;
        this.material = material;
        this.color = color;
        this.count = count;
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public String getCondition() {
        return condition;
    }

    public String getDescription() {
        return description;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }
}

