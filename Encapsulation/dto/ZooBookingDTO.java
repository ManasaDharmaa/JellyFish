package com.xworkz.events.dto;

import java.io.Serializable;

public class ZooBookingDTO implements Serializable {

    private String customerName;
    private String email;
    private long mobileNo;
    private int noOfTickes;

    public ZooBookingDTO(String customerName, String email, long mobileNo, int noOfTickes) {
        this.customerName = customerName;
        this.email = email;
        this.mobileNo = mobileNo;
        this.noOfTickes = noOfTickes;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getNoOfTickes() {
        return noOfTickes;
    }

    public void setNoOfTickes(int noOfTickes) {
        this.noOfTickes = noOfTickes;
    }
}
