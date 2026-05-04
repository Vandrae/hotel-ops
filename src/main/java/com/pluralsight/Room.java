package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private Double Price;
    private Boolean isOccupied;
    private Boolean isDirty;
    private Boolean isAvailable;

    public Room(int numberOfBeds, Double price, Boolean isOccupied, Boolean isDirty, Boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        Price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public Double getPrice() {
        return Price;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public Boolean getDirty() {
        return isDirty;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }







}
