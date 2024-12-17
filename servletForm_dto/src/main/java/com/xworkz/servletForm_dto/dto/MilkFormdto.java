package com.xworkz.servletForm_dto.dto;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


public class MilkFormdto {

    private String brand;
    private String type;
    private int quantity;
    private double cost ;
    private double  total;


    public MilkFormdto(double total, double cost, int quantity, String type, String brand) {
        this.total = total;
        this.cost = cost;
        this.quantity = quantity;
        this.type = type;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
