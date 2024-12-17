package com.xworkz.servletForm_dto.dto;

public class SweetFormdto {

    private String shopName;
    private String sweetName;
    private boolean special;
    private  int quantity;

    public SweetFormdto(String shopName, String sweetName, boolean special, int quantity) {
        this.shopName = shopName;
        this.sweetName = sweetName;
        this.special = special;
        this.quantity = quantity;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getSweetName() {
        return sweetName;
    }

    public void setSweetName(String sweetName) {
        this.sweetName = sweetName;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
