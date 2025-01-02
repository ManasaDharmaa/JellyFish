package com.xworkz.servletChaining.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Milkdto {

    private  int id;
    private String brand;
    private String type;
    private int quantity;
    private  double price;

}
