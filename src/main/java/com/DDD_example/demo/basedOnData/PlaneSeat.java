package com.DDD_example.demo.basedOnData;

import com.DDD_example.demo.commons.SeatSize;
import lombok.Data;

@Data
public class PlaneSeat {
    private Long id;
    private String seatNumber;
    private double price;
    private SeatSize size;
    private boolean isAssigned;
    private boolean isWindowSeat;
    private boolean isAisleSeat;
}
