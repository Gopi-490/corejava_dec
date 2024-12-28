package com.neoteric.busticket;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Bus> roteList = new ArrayList<>();

        Bus hydTokhm = new Bus("hyd", 2345, "khm ", "Ac", "22-12-2024", "23-12-2024", " 9.30", "1.20",380);
        Bus hydTokhm1 = new Bus("hyd", 2345, "khm", "Non-Ac", "22-12-2024", "23-12-2024", "11.30", "3.30", 280);

        roteList.add(hydTokhm1);
        roteList.add(hydTokhm);

        TicketDetails ticketDetails = new TicketDetails();
        ticketDetails.bus= hydTokhm1;
       // ticketDetails.passengerDetails =
        BusAvalibality busAvalibality = new BusAvalibality(" ",""," ", " ");

        TicketDetailsService ticketDetailsService = new TicketDetailsService();
        ticketDetailsService.getTicketDetails(ticketDetails,busAvalibality);

        System.out.println("rotelist" + roteList);
    }
}
