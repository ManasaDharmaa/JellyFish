package com.xworkz.events.runner;

import com.xworkz.events.boot.ZookBooker;
import com.xworkz.events.dto.ZooBookingDTO;
import com.xworkz.events.event.TicketBookingException;

public class ZooRunner {
    public static void main(String[] args) {

        ZooBookingDTO zooBookingDTO = new ZooBookingDTO("M", "ma", 93l, 5);
        ZookBooker zookBooker = new ZookBooker();

        try {
            zookBooker.buyTickets(zooBookingDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("After the exception handling");


    }
}
