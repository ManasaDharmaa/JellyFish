package com.xworkz.language.dto;

public class LanguageCompareToDto implements Comparable<LanguageCompareToDto> {
    
    private int cost;
    private String brand;

    public LanguageCompareToDto(int cost, String brand) {
        this.cost = cost;
        this.brand = brand;
    }

    public int compareTo(LanguageCompareToDto i) {
        int costComparison = Integer.compare(this.cost, i.cost);
        
        if (costComparison == 0) {
            return this.brand.compareTo(i.brand);
        }
        
        return costComparison;
    }

    public int getCost() {
        return cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    @Override
    public String toString() {
        return "LanguageCompareToDto [cost=" + cost + ", brand=" + brand + "]";
    }
}
