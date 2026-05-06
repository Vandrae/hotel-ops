package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(int numberOfSuites, int numberOfRooms) {
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(int numberOfSuites, int numberOfRooms,int bookedSuites, int bookedBasicRooms) {
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedBasicRooms = bookedBasicRooms;
        this.bookedSuites = bookedSuites;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if (numberOfRooms >= 1){
            return isSuite;
        }
        return isSuite;
    }
}
