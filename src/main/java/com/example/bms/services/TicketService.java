package com.example.bms.services;

import com.example.bms.models.Ticket;

import java.util.List;

public interface TicketService {

    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws Exception;
}
