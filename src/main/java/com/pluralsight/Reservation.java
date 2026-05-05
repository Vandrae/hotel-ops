package com.pluralsight;

public class Reservation {
    private String roomType;
    private final Double kingRoom = 139.00;
    private final Double doubleRoom = 124.00;
    private boolean isWeekend;
    private int numberOfNights;
    private double reservationTotal;

    public Reservation(String roomType, Double kingRoom, Double doubleRoom, boolean isWeekend, int numberOfNights, double reservationTotal) {
        this.roomType = roomType;
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

    public double getPrice() {
        if (roomType.equalsIgnoreCase("king") && isWeekend) {
            return kingRoom * 1.1;

        } else if (roomType.equalsIgnoreCase("double") && isWeekend) {
            return doubleRoom * 1.1;

        } else if (roomType.equalsIgnoreCase("king")) {
            return kingRoom;
        } else if (roomType.equalsIgnoreCase("double")) {
            return doubleRoom;
        }
        //this is a computer stupid moment b/c all cases are covered,
        // but it wants well if none of these happen then what?
        return 0;
    }

    public double reservationTotal () {
        return numberOfNights * getPrice();

    }




}
