package com.xworkz.servletForm_dto.dto;

public class MusuemTicketFormdto {

    private String name;
    private String special;
    private  long mobile;
    private String email;

    public MusuemTicketFormdto(String name, String special, long mobile, String email) {
        this.name = name;
        this.special = special;
        this.mobile = mobile;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
