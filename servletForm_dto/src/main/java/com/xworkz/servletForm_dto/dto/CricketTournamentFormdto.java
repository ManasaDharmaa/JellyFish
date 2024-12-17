package com.xworkz.servletForm_dto.dto;

public class CricketTournamentFormdto {

    private String team;
    private int member;
    private String name;
    private int extra;
    private int left;
    private int right;
    private int bowlers;
    private int batman;

    public CricketTournamentFormdto(String team, int member, String name, int extra, int left, int right, int bowlers, int batman) {
        this.team = team;
        this.member = member;
        this.name = name;
        this.extra = extra;
        this.left = left;
        this.right = right;
        this.bowlers = bowlers;
        this.batman = batman;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getBowlers() {
        return bowlers;
    }

    public void setBowlers(int bowlers) {
        this.bowlers = bowlers;
    }

    public int getBatman() {
        return batman;
    }

    public void setBatman(int batman) {
        this.batman = batman;
    }
}
