package com.DDD_example.demo.basedOnData;

import lombok.Data;

@Data
public class Hotel {
    private Long id;
    private String name;
    private String address;
    private int rating; // Calificación del hotel
    private int numberOfRooms;
    private List<Room> rooms;
    private String phoneNumber;
    private String email;
}
