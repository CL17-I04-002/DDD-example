package com.DDD_example.demo.basedOnData;

public class Ticket {
    private Long id;
    private Long customerId;
    private Flight flight;
    private PlaneSeat seat;
    private double price; // Calculado como seat.getPrice() + impuestos
    private String status;
    private String ticketNumber;
}
