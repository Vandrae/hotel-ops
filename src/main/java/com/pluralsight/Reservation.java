package com.pluralsight;

public class Reservation {
private String roomType ;
private  Double kingRoom = 139.00;
private  Double doubleRoom = 124.00;
private boolean isWeekend;
private  int numberOfNights;
private double reservationTotal;

    public Reservation(String roomType, Double kingRoom, Double doubleRoom, boolean isWeekend, int numberOfNights, double reservationTotal) {
        this.roomType = roomType;
        this.kingRoom = kingRoom;
        this.doubleRoom = doubleRoom;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }

    public Double getKingRoom() {
        return kingRoom;
    }

    public Double getDoubleRoom() {
        return doubleRoom;
    }

    public double weekendPrice(){
        if (roomType.equals("king") && isWeekend == true){
            return kingRoom * 1.1;

        } else if (roomType.equals("double") && isWeekend == true){
            return doubleRoom * 1.1;

    }

    public boolean

    //if over weekend incrase price by 10%
    // calc total
    //
    //
    //




}
