package com.xworkz.events.boot;

import com.xworkz.events.dto.ZooBookingDTO;
import com.xworkz.events.event.TicketBookingException;

public class ZookBooker {

    public void buyTickets(ZooBookingDTO zooBookingDTO) throws Exception{
       String customerName = zooBookingDTO.getCustomerName();
       String email  = zooBookingDTO.getEmail();
       long mobileNo = zooBookingDTO.getMobileNo();
       int noOfTickes = zooBookingDTO.getNoOfTickes();

       System.out.println("this is ZooBooker");

        if(customerName.length() > 3 || email.contains("@gmail.com") || mobileNo > 10 || noOfTickes > 1){
           throw new TicketBookingException();
        } else {
            System.out.println("invalid information");
        }

    }
}
