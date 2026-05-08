package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_makeRoomDirty(){
//    Name_condition_expectedResult
//    checkIn_whenRoomIsAvailable_succeeds()
//    checkIn_withoutReservation_fails{)
        //arrange
        Room room = new Room(1,10.00,false,false);

        //act
       room.checkIn();
        //assert
        assertTrue(room.getDirty());
    }

    @Test
    public void room_shouldBe_occupied(){
        //arrange
        Room room = new Room(1,10.00,true,true);

        //act
        room.checkIn();
        //assert
        assertEquals(true,room.getOccupied());
    }

    @Test
    public void room_shouldBe_available(){
        //arrange
        Room room = new Room(1,10.00,true,true);

        //act
        room.isAvailable();
        //assert
        assertEquals(false,room.isAvailable());
    }

    @Test
    public void checkIn_shouldBe_false(){
        //arrange
        Room room = new Room(1,10.00,true,true);

        //act
        room.checkIn();
        //assert
        assertEquals(0,room.checkIn());
    }



}