package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private Double Price;
    private Boolean isOccupied;
    private Boolean isDirty;


    public Room(int numberOfBeds, Double price, Boolean isOccupied, Boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        Price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;

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


    private boolean isDirty() {
    return isDirty;
    }


    private boolean isOccupied() {
        return  isOccupied;
    }

    public boolean isAvailable(){
        return !this.isOccupied() && !this.isDirty();
    }

    public short checkIn(){
        if (isAvailable()){
            //marked occupied
            this.isOccupied = true;
            //marked as dirty
            this.isDirty = true;
        }

        return 0;
    }

    public void checkOut(){
        //cleaned by housekeeper
        cleanRoom();

        this.isOccupied = false;
    }

    public void cleanRoom(){
        this.isDirty = false;
    }

//    public void cleanRoom(boolean isDirty){
//        if(isDirty){
//            //puts in ticket to clean room and room is cleaned
//           isDirty=false;
//        }
    }




}
