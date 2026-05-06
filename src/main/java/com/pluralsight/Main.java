package com.pluralsight;

public class Main {
    public static void main(String[] args) {HotelBooking booking = new HotelBooking();

        System.out.println("Test 1 - bookRoom(1, true)   -> " + booking.bookRoom(1, true)   + "  (expected: true)");
        System.out.println("Test 2 - bookRoom(5, true)   -> " + booking.bookRoom(5, true)   + "  (expected: true)");
        System.out.println("Test 3 - bookRoom(1, false)  -> " + booking.bookRoom(1, false)  + "  (expected: false)");
        System.out.println("Test 4 - bookRoom(10, false) -> " + booking.bookRoom(10, false) + "  (expected: false)");
        System.out.println("Test 5 - bookRoom(0, true)   -> " + booking.bookRoom(0, true)   + "  (expected: false)");
        System.out.println("Test 6 - bookRoom(0, false)  -> " + booking.bookRoom(0, false)  + "  (expected: false)");
        System.out.println("Test 7 - bookRoom(-1, true)  -> " + booking.bookRoom(-1, true)  + "  (expected: false)");

    }
}
