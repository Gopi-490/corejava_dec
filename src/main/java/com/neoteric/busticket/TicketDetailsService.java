package com.neoteric.busticket;

import java.util.ArrayList;
import java.util.List;

public class TicketDetailsService {

        public TicketDetails getTicketDetails (TicketDetails ticketadaetails,BusAvalibality busAvalibality){
            if (busAvalibality.fromCity.equals("hyd")&& busAvalibality.toCity.equals("kh")) {
                ticketadaetails.rout = new Rout();
            }
            return ticketadaetails;
            }
        }


