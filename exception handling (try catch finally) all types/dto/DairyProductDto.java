package com.xworkz.tryBlocks.dto;

public class DairyProductDto {

    private  String productName;
    private  String brand;
    private  int cost;
    private int totalItems;

    public DairyProductDto(String productName, int totalItems, String brand, int cost) {
        this.productName = productName;
        this.totalItems = totalItems;
        this.brand = brand;
        this.cost = cost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }
}
