package com.xworkz.riverjpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "temple")
public class TempleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Integer id;
    private  String  name;
    private String facingTowards;
    private String place;
}
