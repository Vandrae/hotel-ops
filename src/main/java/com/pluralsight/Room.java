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

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    public Boolean getDirty() {
        return isDirty;
    }

    public void setDirty(Boolean dirty) {
        isDirty = dirty;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    private boolean isDirty() {
    return isDirty;
    }


    private boolean isOccupied() {
        return  isOccupied;
    }

    public boolean isAvailable(){
        return !this.isOccupied() && !this.isDirty();
    }




}
