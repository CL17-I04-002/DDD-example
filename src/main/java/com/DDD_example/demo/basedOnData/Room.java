package com.DDD_example.demo.basedOnData;

import com.DDD_example.demo.commons.RoomSize;
import lombok.Data;

@Data
public class Room {
    private Long id;
    private int roomNumber;
    private double price;
    private RoomSize size;
    private boolean isAssigned;
    private int floor;
    private String bedType;
}
